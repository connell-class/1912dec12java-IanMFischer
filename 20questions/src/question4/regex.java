package question4;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class regex {

	public static void main(String[] args) {
		String re = "[^0-9\\\\+\\\\. \\\\(\\\\)-]+";
		String text = "123-abc-7890";
		Pattern pt = Pattern.compile(re);
		Matcher m = pt.matcher(text);
		
		while(m.find())
		{
			System.out.println("Pattern found from "+m.start()+" to " + (m.end()-1));
//			if 
//			throw new IllegalArgumentException()
		}
	
	}
}
//[^0-9\\+\\. \\(\\)-]+