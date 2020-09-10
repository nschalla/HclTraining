package Probs1;

public class PremiumStall implements Stall{
String stallName,ownerName;
Integer cost,projector;
public PremiumStall() {
	super();
	// TODO Auto-generated constructor stub
}
public PremiumStall(String stallName, String ownerName, Integer cost, Integer projector) {
	super();
	this.stallName = stallName;
	this.ownerName = ownerName;
	this.cost = cost;
	this.projector = projector;
}
public String getStallName() {
	return stallName;
}
public void setStallName(String stallName) {
	this.stallName = stallName;
}
public String getOwnerName() {
	return ownerName;
}
public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}
public Integer getCost() {
	return cost;
}
public void setCost(Integer cost) {
	this.cost = cost;
}
public Integer getProjector() {
	return projector;
}
public void setProjector(Integer projector) {
	this.projector = projector;
}
@Override
public void display() {
	System.out.println("Stall Name : "+getStallName());
	System.out.println("Cost : "+getCost());
	System.out.println("Owner Stall"+getOwnerName());
	System.out.println("Number of Projectors : "+getProjector());
}

}
