public class Soup extends Refreshment
{
	public void prepareRefreshment()
	{
		System.out.println("Soup is being Prepared...");
		Timer.setTime(10000);
		System.out.println("Soup is Prepared...");
	}
}
