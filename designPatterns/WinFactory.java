package com.interview.designPatterns;

public class WinFactory implements IGUIFactory
{
	@Override
	public IButton createButton()
	{
		return new WinButton();
	}

}
