import java.util.Scanner;

/*This program checks the words of
 * the user's input and also checks its
 * length
*/
public class WordLengthCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a word, or a word of your dreams: ");
		
		String word = scan.next();
		
		
		if(word.length() % 2==0 )
		{
			System.out.println("The amount of characters of your word is even: "+word.length());
		}
		
		else
		{
			System.out.println("The amount of characters of your word is odd: "+word.length());
		}
		
	}

}
