/*
 * Pojo class Balls 
 */
public class Balls {



private int ballWeight;
private String ballName;
private String ballColor;
public String getBallColor() {
	return ballColor;
}


public void setBallColor(String ballColor) {
	this.ballColor = ballColor;
}


public Balls(int ballWeight, String ballName, String ballColor) {
	super();
	this.ballWeight = ballWeight;
	this.ballName = ballName;
	this.ballColor = ballColor;
}


public int getBallWeight() {
	return ballWeight;
}



public void setBallWeight(int ballWeight) {
	this.ballWeight = ballWeight;
}





@Override
public String toString() {
	return "Balls [ballWeight=" + ballWeight + ", ballName=" + ballName + ", ballColor=" + ballColor + "]";
}


public String getBallName() {
	return ballName;
}

public void setBallName(String ballName) {
	this.ballName = ballName;
}





}
