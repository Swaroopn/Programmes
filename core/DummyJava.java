package com.interview.core;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class DummyJava
{

	public static void main( String[] args ) throws UnknownHostException
	{
		System.out.println( InetAddress.getByName( "192.168.43.243" ).getHostName() );
	}

}
