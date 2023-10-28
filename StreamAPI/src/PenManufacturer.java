
public class PenManufacturer {
private Pens pens;
public PenManufacturer(Pens pens, int cost, int quantity) {
	super();
	this.pens = pens;
	this.cost = cost;
	this.quantity = quantity;
}
private int cost;
private int quantity;
public Pens getPens() {
	return pens;
}
public void setPens(Pens pens) {
	this.pens = pens;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}


}
