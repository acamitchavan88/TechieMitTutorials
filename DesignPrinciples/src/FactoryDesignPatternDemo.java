/*
 * #TechieMit Program to implement Factory Design pattern
 * 
 * 1 Interface
 * 2 Classes implementing interface
 * 3 Class  Factory
 * 4 Client implementing Factory Pattern
 */

interface Vehicle
{
	public void wheelType();

}

class TwoWheeler implements Vehicle
{

	@Override
	public void wheelType() {
		System.out.println("Two wheelers have 2 wheels");
		
	}
	}
class ThreeWheeler implements Vehicle
{

	@Override
	public void wheelType() {
		System.out.println("Three wheelers have 3 wheels");
		
	}
	}
class FourWheeler implements Vehicle
{

	@Override
	public void wheelType() {
		System.out.println("Four wheelers have 4 wheels");
		
	}
	}

class VehicleFactory
{
	
		public Vehicle getVehicleType(String type)
		{
			if(type==null)
			{	return null;
			}
			else
			{
			switch(type)
			{
			case "TwoWheeler":return new TwoWheeler();
			case "ThreeWheeler":return new ThreeWheeler();
			case "FourWheeler":return new FourWheeler();
			default:System.out.println("You have passed null in argument");	
			return null;
			}
			}
			
		}
}

public class FactoryDesignPatternDemo {

	public static void main(String[] args) {
	  // Instance of VehicleFactory
		
		VehicleFactory vehicleFactory=new VehicleFactory();
		//Invoking instance on vehicleFactory based on type
		Vehicle twoWheelerVehicle=vehicleFactory.getVehicleType("TwoWheeler");
			twoWheelerVehicle.wheelType();
			
			Vehicle threeWheelerVehicle=vehicleFactory.getVehicleType("ThreeWheeler");
			threeWheelerVehicle.wheelType();
			Vehicle fourWheelerVehicle=vehicleFactory.getVehicleType("FourWheeler");
			fourWheelerVehicle.wheelType();
			
			Vehicle nullValue=vehicleFactory.getVehicleType("null");
			
			//nullValue.wheelType();

	}

}
