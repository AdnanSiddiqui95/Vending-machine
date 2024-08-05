import java.util.Random;

public class Timer 
{
	public static void setTime(long time)
	{
		Random ra=new Random();
		int num=ra.nextInt(10)+10;
		System.out.println("Please wait...");
		System.out.println("It will take "+num+" seconds");
		for(int c=num;c>=1;c--)
		{
			System.out.print(c+" ");
			try 
			{
				Thread.sleep(1000);
				}
			catch(Exception ex)
			{}
		}
		System.out.println();
	}
}
