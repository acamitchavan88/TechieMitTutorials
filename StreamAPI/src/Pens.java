public class Pens {
private String penName;

public Pens(String penName, String penType) {
	super();
	this.penName = penName;
	this.penType = penType;
}
private String penType;
public String getPenName() {
	return penName;
}
public void setPenName(String penName) {
	this.penName = penName;
}
public String getPenType() {
	return penType;
}
public void setPenType(String penType) {
	this.penType = penType;
}
@Override
public String toString() {
	return "Pens [penName=" + penName + ", penType=" + penType + "]";
}
  
}
