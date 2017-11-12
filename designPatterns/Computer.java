package com.interview.designPatterns;

public class Computer
{
	private String RAM, HDD;

	//optional params
	private boolean isGraphicCardEnabled, isBluetoothEnabled;

	public Computer( ComputerBuilder builder )
	{
		this.RAM = builder.RAM;
		this.HDD = builder.HDD;
		this.isGraphicCardEnabled = builder.isGraphicCardEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
	}

	public String getRAM()
	{
		return RAM;
	}

	public void setRAM( String rAM )
	{
		RAM = rAM;
	}

	public String getHDD()
	{
		return HDD;
	}

	public void setHDD( String hDD )
	{
		HDD = hDD;
	}

	public boolean isGraphicCardEnabled()
	{
		return isGraphicCardEnabled;
	}

	public boolean isBluetoothEnabled()
	{
		return isBluetoothEnabled;
	}

	public static class ComputerBuilder
	{
		private String RAM, HDD;
		//optional parameters
		private boolean isGraphicCardEnabled, isBluetoothEnabled;

		public ComputerBuilder( String RAM, String HDD )
		{
			this.RAM = RAM;
			this.HDD = HDD;
		}

		public ComputerBuilder setGraphicCardEnabled( boolean enabled )
		{
			this.isGraphicCardEnabled = enabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnabled( boolean enabled )
		{
			this.isBluetoothEnabled = enabled;
			return this;
		}

		public Computer build()
		{
			return new Computer( this );
		}
	}
}
