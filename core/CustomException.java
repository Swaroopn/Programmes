package com.interview.core;

public class CustomException extends RuntimeException
{
	private static final long serialVersionUID = 1L;

	public CustomException( String s )
	{
		super( s );
	}
}
