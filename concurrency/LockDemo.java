package concurrency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LockDemo
{
	private static final Log logger = LogFactory.getLog( LockDemo.class );

	public static void main( String[] args )
	{
		String userName = "swaroop";

		isLockAvailable( userName );

		LockManager.getBcrplanlockmap().lock( userName );
		logger.info( "Acquired lock on the User: " + userName );

		isLockAvailable( userName );

		LockManager.getBcrplanlockmap().unlock( userName );
		logger.info( "Lock released for ther User: " + userName );
	}

	private static void isLockAvailable( String userName )
	{
		if ( LockManager.getBcrplanlockmap().isLocked( userName ) )
			logger.info( "Waiting for a lock to be released which is associated with the User: " + userName );
	}
}
