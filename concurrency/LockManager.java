package concurrency;

public class LockManager
{
	private static final LockMap bcrPlanLockMap = new LockMap();

	public static LockMap getBcrplanlockmap()
	{
		return bcrPlanLockMap;
	}
}
