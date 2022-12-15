import java.util.Scanner;

public class Count {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int count1 = 0, num;

				System.out.print("Enter a number");
	
		int num1=sc.nextInt();
		
		while(num1 !=0)
		{
			num1 /=10;
			++count1;
		}
		String count;
		System.out.println("Number of digits:" +count1);
		
		
	}

}
