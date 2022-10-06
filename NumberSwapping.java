import java.util.Scanner;

public class NumberSwapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int num1 = scan.nextInt();
		
		System.out.println("Enter the second number: ");
		int num2 = scan.nextInt();
		
		String spaceswap = ""+num2+","+num1;
		
		System.out.println("Before the swap: "+num1+","+num2);
		System.out.println("After the swap: "+spaceswap);
		
		
		
	}

}
