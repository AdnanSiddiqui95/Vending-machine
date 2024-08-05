import java.util.Scanner;

public class User {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1: Press 1 for Coffee");
		System.out.println("2: Press 2 for Tea");
		System.out.println("3: Press 3 for Soup");
		System.out.println("--------------------------");
		System.out.print("Enter Your Drink  Number: ");
		
		int num=sc.nextInt();
		if(num==1)
			RefreshmentMachine.prepare(new Coffee());
		else if(num==2)
			RefreshmentMachine.prepare(new Tea());
		else if(num==3)
			RefreshmentMachine.prepare(new Soup());
		else 
			System.out.println("OH!  Invalid Input");
		
		
		
		
		
	}

}
