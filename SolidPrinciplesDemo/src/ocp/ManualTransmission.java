package ocp;

public class ManualTransmission implements Transmission{

	@Override
	public void modeOfTransmission() {
		System.out.println("Here we have manual mode of Transmission which allows"
				+ "the gear shift mechanism to change manually");
		
	}

}
