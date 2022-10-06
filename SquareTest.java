import java.util.Scanner;


public class SquareTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the length of the rectangle: ");
		int length = scan.nextInt();
		
		System.out.println("Enter the width of the rectangle: ");
		int width = scan.nextInt();
		
		if(length==width){
			System.out.println("The dimesion of the rectangle is that"
					+ " of a square");
		}
		
		else {
			System.out.println("The length and the width of the rectangle is a "
					+ " rectangle, but no square.");
		}
		
		
	}

}
