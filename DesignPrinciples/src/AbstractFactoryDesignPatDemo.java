/*
 * Author: #TechieMit :Program to demonstrate use of abstract factory design pattern in Java
 */
//Create Cars
interface Cars
{
	public void drive();
}

//Concrete classes 
class ManualCars implements Cars
{
	@Override
	public void drive() {
		System.out.println("We provide manual drive transmission to the cars");
		
	}	
}
class AutomaticCars implements Cars
{

	@Override
	public void drive() {
	System.out.println("We provide automatic drive transmission to the cars");
		
	}
}

//AbstractFActory 

interface CarFactory
{
 Cars  manufactureCars();
}

//Provide products for above abstractFActory 

class ManualCarFactory implements CarFactory
{
	@Override
	public Cars manufactureCars() {
		// TODO Auto-generated method stub
		return new ManualCars();
	}
}

//Provide products for automaticCarFactory
class AutomaticCarFactory implements CarFactory
{

	@Override
	public Cars manufactureCars() {
		// TODO Auto-generated method stub
		return new AutomaticCars();
	}
}

//Client demo 

public class AbstractFactoryDesignPatDemo
{
	
	public static void main(String[]s)
	{
		//Create Manual Cars
		CarFactory manualCarFactory=new ManualCarFactory();
		manualCarFactory.manufactureCars();
		//Create manual Cars and invoke drive method
		Cars manualCars=new ManualCars();
		manualCars.drive();
		//Create Automatic Cars
		CarFactory autoCarFactory=new AutomaticCarFactory();
		autoCarFactory.manufactureCars();
		//Create auto Cars and invoke drive method
		Cars autoCars=new AutomaticCars();
		autoCars.drive();
		
		
	}

}