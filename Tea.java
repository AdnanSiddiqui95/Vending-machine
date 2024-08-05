public class Tea extends Refreshment
{
	public void prepareRefreshment()
	{
		System.out.println("Tea is being Prepared...");
		Timer.setTime(10000);
		System.out.println("Tea is Prepared...");
	}
}
