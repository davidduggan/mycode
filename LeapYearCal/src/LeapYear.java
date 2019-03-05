import java.util.Scanner;
public class LeapYear 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a year to calculate: ");
		int year = in.nextInt();
		
		if(year % 4 != 0)
		{
			System.out.println("Is not a leap year!");
		}
		else if(year % 400 == 0)
		{
			System.out.println("Is a leap year!");
		}
		else if(year % 100 == 0)
		{
			System.out.println("Is not a leap year!");
		}
		else
		{
			System.out.println("Is a leap year!");
		}
	}

}
