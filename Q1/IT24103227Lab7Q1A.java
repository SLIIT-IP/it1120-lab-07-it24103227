import java.util.Scanner;
public class  IT24103227Lab7Q1A
{
	public static void main (String[]arg)
	{
	Scanner input =new Scanner(System.in);
	int num1,num2,num3,num4;
	double ave;

	System.out.print("Enter subject mark 1: ");
	num1=input.nextInt();


	System.out.print("Enter subject mark 2: ");
	num2=input.nextInt();


	System.out.print("Enter subject mark 3: ");
	num3=input.nextInt();


	System.out.print("Enter subject mark 4: ");
	num4=input.nextInt();	

	ave=(num1+num2+num3+num4)/4;

	
	System.out.println("Average is :"+ave);
		if(ave<=49){System.out.println("overall grade is : Fail");}
		else if(ave<=74){System.out.println("overall grade is : Credit");}
		else if(ave<=100){System.out.println("overall grade is : Distinction");}
	}	

}