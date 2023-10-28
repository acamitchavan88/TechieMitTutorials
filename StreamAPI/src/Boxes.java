/*
 *  @Author #TechieMit
 */
public class Boxes {

	private final String name;
	private final String color;

	private final int weight;

	private final boolean box_filled;

public Boxes(String name, String color, int weight, boolean box_filled) {
	super();
	this.name = name;
	this.color = color;
	this.weight = weight;
	this.box_filled = box_filled;
}
public Boxes() {
	super();
	this.name = "";
	this.color = "";
	this.weight = 0;
	this.box_filled = false;
	
}

public String getName() {
	return name;
}
public String getColor() {
	return color;
}
public int getWeight() {
	return weight;
}
public boolean isBox_filled() {
	return box_filled;
}




}
