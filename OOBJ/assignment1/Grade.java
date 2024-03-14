package assignment1;
import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Marks");
		int M = sc.nextInt();
		char grade=0,Fail;
		if(M>80)
		{
			grade='A';
		}
		else if(M>40 && M<80)
		{
			grade='B';
		}
		else if(M<40) 
		{
			grade='C';
		}
			
		System.out.println(grade);

	}

}

