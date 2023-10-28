package com.java8.defaultMethodDemo;
@FunctionalInterface
public interface DefaultMethodInterface {

	float subtract();

	public default void print()
	{
		System.out.println("Here we can print the calculations done in functions");
	}

	static void calculate()
	{
		System.out.println("Now here is the static call to calculate method");
	}
	
}
