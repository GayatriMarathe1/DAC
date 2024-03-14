package assignment1;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter weight in kg");
		int weight=input.nextInt();
		System.out.println("Enter height in meter square");
		int height=input.nextInt();
		
		int bmi=weight/height;
		if(bmi<18.5)
		{
			System.out.println("underweight.");
		}
		else if(bmi >= 18.5 && bmi < 25) {
			System.out.println("normal weight.");
		} else {
			System.out.println("overweight.");
		}
	}

}
