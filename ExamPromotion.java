import java.util.Scanner;
import java.text.*;
public class ExamPromotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double ATTEN = 0.75;
		Scanner scan = new Scanner(System.in);
		
		NumberFormat Format1 = NumberFormat.getPercentInstance();
		
		System.out.println("Enter the amount of classes held: ");
		double Class_parti = scan.nextInt();
		
		System.out.println("Enter the number of classes attended: ");
		double Class_Atten = scan.nextInt();
		
		
		double Class_AttenF = Class_Atten / Class_parti;
		
		
		
		System.out.println("Your class attendance percentage is: "+Format1.format(Class_AttenF));
		
		if(Class_AttenF < ATTEN) {
			
			System.out.println("Your class attendance is less than 75%, "
					+ "which will not get you to sit in the exams.");	
		}
		
		else
		{
			System.out.println("Your class attendance will get you to sit in exams.");

		}
		
	}

}
