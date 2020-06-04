package com.interview.designPatterns;

/**
 * 
 * @author Swaroop Nagendra
 * Singleton Pattern ensures that a class has only one instance and 
 * provides global point of access to it.
 */
public class Singleton
{
	private Singleton()
	{
	}

	/*
	 * Eager Initialization
	 */
	private static Singleton eagerInst = new Singleton();

	public static Singleton getEagerInstance()
	{
		return eagerInst;
	}

	/*
	 * Lazy Initialization
	 */
	private static Singleton lazyInst;

	public static Singleton getLazyInstance()
	{
		if ( lazyInst == null )
			lazyInst = new Singleton();

		return lazyInst;
	}

	/*
	 * Static Block Initialization
	 */
	private static Singleton staticInst;
	static
	{
		staticInst = new Singleton();
	}

	public static Singleton getStaticInstance()
	{
		return staticInst;
	}

	/*
	 * Thread Safe initialization
	 */
	private static Singleton threadSafeInst;

	public static synchronized Singleton getThreadSafeInstance()
	{
		if ( threadSafeInst == null )
			threadSafeInst = new Singleton();

		return threadSafeInst;
	}

	/*
	 * Double Checked Lock (DCL) Initialization
	 */
	private static Singleton dclInst;

	public static Singleton getDCLInst()
	{
		synchronized (Singleton.class)
		{
			if ( dclInst == null )
				dclInst = new Singleton();
			return dclInst;
		}
	}

	/*
	 * Better than above DCL 
	 */
	private static Singleton dclImprovedInst;

	public static Singleton getDCLImprovedInst()
	{
		if ( dclImprovedInst == null )
		{
			synchronized (Singleton.class)
			{
				if ( dclImprovedInst == null )
					dclImprovedInst = new Singleton();
			}
		}
		return dclImprovedInst;
	}
}
