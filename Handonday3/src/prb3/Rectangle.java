package prb3;

public class Rectangle extends Shape  {
 private Double length,breadth,area;
 
public Rectangle(Double length, Double breadth) {
	super();
	this.length = length;
	this.breadth = breadth;
}

public Rectangle() {
	super();
}

public void computeArea() {
	area=(length*breadth);
	System.out.println("Area of the rectangle : "+ area);
}
}
