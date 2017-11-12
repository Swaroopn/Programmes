package com.interview.designPatterns;

/**
 * 
 * @author Swaroop Nagendra
 * AbstractFactory pattern uses composition while Factory Pattern uses Inheritance
 * AFP used to create collection of objects while FP is for single Object
 */
public class AbstractFactory
{
	public static void main( String[] args )
	{
		IGUIFactory factory = null;
		String type = "osx";

		if ( "osx".equalsIgnoreCase( type ) )
		{
			factory = new OSXFactory();
		}
		else if ( "win".equalsIgnoreCase( type ) )
		{
			factory = new WinFactory();
		}

		IButton button = factory.createButton();
		button.paint();int a = 1/0;
	}
}
