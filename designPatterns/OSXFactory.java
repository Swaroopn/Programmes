package com.interview.designPatterns;

public class OSXFactory implements IGUIFactory
{
	@Override
	public IButton createButton()
	{
		return new OSXButton();
	}

}
