package com.java8.defaultMethodDemo;
/*@Author #TechieMit
 * Default method demo
 */
public class DefaultMethods implements DefaultMethodInterface {

	@Override
	public float subtract() {
		float result=50.33f-23.21f;
		return result;
	}


	public static void main(String[]s)
	{
		DefaultMethods defaultMethods=new DefaultMethods();
		//Call to the interface methods
		float result=defaultMethods.subtract();
		//Default method in that interface
		defaultMethods.print();
		//Here we gave call to the static method of interface
		DefaultMethodInterface.calculate();
		System.out.println("The result of operations are::"+result);
	}
}
