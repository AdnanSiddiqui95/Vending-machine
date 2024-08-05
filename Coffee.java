public class Coffee extends Refreshment
{
	public void prepareRefreshment()
	{
		System.out.println("Coffee is being Prepared...");
		Timer.setTime(10000);
		System.out.println("Coffee is Prepared...");
	}
}
