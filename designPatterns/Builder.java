package com.interview.designPatterns;

/**
 * 
 * @author Swaroop Nagendra
 * 
 * Builder Pattern - The intention of Builder pattern is used to separate the construction
 * of complex object from its representation so that same construction process can create
 * different representations.
 *
 */
public class Builder
{
	public static void main( String[] args )
	{
		Computer pc = new Computer.ComputerBuilder( "4 GB", "2 GB" ).setBluetoothEnabled( true ).setGraphicCardEnabled( false ).build();
		System.out.println( pc.getRAM() );
	}
}
