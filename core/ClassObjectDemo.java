package com.interview.core;

public class ClassObjectDemo
{
	private int age;
	private String name;

	public int getAge()
	{
		return age;
	}

	public void setAge( int age )
	{
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	public static void main( String[] args ) throws ClassNotFoundException
	{
		System.out.println( String.class.getClassLoader() );
		System.out.println( ClassObjectDemo.class.getClassLoader() );
		Animal a;
		a = new Dog();
		a.getName();
	}

}
