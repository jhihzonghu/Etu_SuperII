package regexp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp_EtuData {
  private final static String INPUT_DATA ="D:\\testdata\\testing.data"; 
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
         ReadInputData(INPUT_DATA);
	}
	private static void ReadInputData(String inputData) throws Exception {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader(inputData);
		BufferedReader br = new BufferedReader(fr);
		while(br.ready())
		{
			String spiltLog = Regexp(br.readLine());
		    System.out.println(spiltLog);
			
		}
		fr.close();
	}
	private static String Regexp(String readLine) {
		// TODO Auto-generated method stub
		String Parser = "plist=[\\d*,]*";
		Pattern SoldDataPattern =Pattern.compile(Parser); 
		Matcher GoodMatcher =SoldDataPattern.matcher(readLine);
		if(GoodMatcher.find())
		{
			return GoodMatcher.group();
		}else{
			return "No Matcher";
		}
		
	}

}
