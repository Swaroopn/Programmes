package com.interview.core;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DiffWaysToInitializeAnObject implements Cloneable
{
	public DiffWaysToInitializeAnObject()
	{
		System.out.println( "Object Created" );
	}

	public static void main( String[] args )
	{
		// using "new" keyword
		DiffWaysToInitializeAnObject obj = new DiffWaysToInitializeAnObject();

		// using "Class.forName"
		try
		{
			DiffWaysToInitializeAnObject obj2 = ( DiffWaysToInitializeAnObject ) Class.forName( "com.interview.core.DiffWaysToInitializeAnObject" ).newInstance();
		}
		catch ( InstantiationException | IllegalAccessException
				| ClassNotFoundException e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try
		{
			DiffWaysToInitializeAnObject obj3 = DiffWaysToInitializeAnObject.class.newInstance();
		}
		catch ( InstantiationException e1 )
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		catch ( IllegalAccessException e1 )
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// using "constructor"
		Constructor<DiffWaysToInitializeAnObject> objConstructor;
		try
		{
			objConstructor = DiffWaysToInitializeAnObject.class.getConstructor();
			objConstructor.newInstance();
		}
		catch ( NoSuchMethodException | SecurityException e1 )
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		catch ( InstantiationException e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch ( IllegalAccessException e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch ( IllegalArgumentException e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch ( InvocationTargetException e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// using "clone"
		try
		{
			DiffWaysToInitializeAnObject clonedObj = ( DiffWaysToInitializeAnObject ) obj.clone();
		}
		catch ( CloneNotSupportedException e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
