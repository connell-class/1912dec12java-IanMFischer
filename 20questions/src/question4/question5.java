package question4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class question5 {
	public static void main(String[] args) {
		cleanPhoneNumber("1a");
	}

	/*
	 * public static String cleanPhoneNumber(String string) { char [] progress =
	 * string.toCharArray(); String num = "023456789"; String finalnum="";
	 * StringBuffer cleanednumber = new StringBuffer(); for (char ele : progress) {
	 * if (num.indexOf(ele)!=-1) { cleanednumber.append(ele);
	 * 
	 * } finalnum = cleanednumber.toString(); } System.out.println(finalnum); return
	 * finalnum; } }
	 */
	public static String cleanPhoneNumber(String string) 
	{
		String theRegex ="[^0-9\\+\\. \\(\\)-]";
		char [] progress = string.toCharArray();
		String num = "023456789";
		String finalnum="";
		StringBuffer cleanednumber = new StringBuffer();
		for (char ele : progress) 
		{
			/*
			 * if (Pattern.matches(theRegex, ele)) { throw new IllegalArgumentException(); }
			 */
			if (num.indexOf(ele)!=-1)
			{
				cleanednumber.append(ele);
			}
		}
		finalnum = cleanednumber.toString();				
		return finalnum;
	}

}