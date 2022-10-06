import java.util.Scanner;


public class PythagoreanTripleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter side a of triangle: ");
		float sideA = scan.nextFloat();
		
		System.out.println("Enter side b of triangle: ");
		float sideB = scan.nextFloat();
		
		System.out.println("Enter the length of side hypotenuse: ");
		float Side_hypot = scan.nextFloat();
		double hypottrip = Math.pow(sideA, 2)+ Math.pow(sideB,2);
		
		if(hypottrip == Math.pow(Side_hypot,2)){
			System.out.println("Side a of "+sideA+", Side b of "+sideB+", "
					+ "Side hypotenuse of "+Side_hypot+", is a right triangle.");
			}
			
		else {
			System.out.println("Side a of "+sideA+", Side b of "+sideB+", "
					+ "Side hypotenuse of "+Side_hypot+", is not a right triangle.");
		}
		
	}

}
