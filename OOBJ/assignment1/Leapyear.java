package assignment1;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Year=sc.nextInt();
		if(Year%4==0 || Year % 100==0 && Year%400==0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not Leap Year");
		}

	}

}
