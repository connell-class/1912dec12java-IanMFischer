package question4;

public class question4 {
	public static void main(String[] args) {
		getScrabbleScore("OxyphenButazone");
	}

	static public int getScrabbleScore(String string) {
		string = string.toLowerCase();
		int score =0;
		char[] charArray = string.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i]== 'a' || 
					charArray[i]== 'e' || 
					charArray[i]== 'i' || 
					charArray[i]== 'o' || 
					charArray[i]== 'u' || 
					charArray[i]== 'l' || 
					charArray[i]== 'n' || 
					charArray[i]== 'r' || 
					charArray[i]== 's' || 
					charArray[i]== 't')
			{	
				score++;
				System.out.println(score);
			}
			else if (charArray[i]== 'd' || charArray[i]== 'g') 
			{
				score = score + 2;
				System.out.println(score);
			}
			else if (charArray[i]== 'b' ||
					charArray[i]== 'c' ||
					charArray[i]== 'm' ||
					charArray[i]== 'p')
			{
				score = score +3;
				System.out.println(score);
			}
			else if (charArray[i]== 'f' ||
					charArray[i]== 'h' ||
					charArray[i]== 'v' ||
					charArray[i]== 'w' ||
					charArray[i]== 'y')
			{
				score = score + 4;
				System.out.println(score);
			}
			else if (charArray[i]== 'k')
			{ 
				score = score + 5;
				System.out.println(score);
			}
			else if (charArray[i]== 'j' || charArray[i]== 'x')
			{
				score = score + 8;
				System.out.println(score);
			}
			else if (charArray[i]== 'q' ||charArray[i]== 'z')
			{
				score = score + 10;
				System.out.println(score);
			}
			else return 0;
		}
		return score;
	}
}