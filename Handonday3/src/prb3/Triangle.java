package prb3;

public class Triangle extends Shape {
private Double base,height,area;
public Triangle() {
	super();
	// TODO Auto-generated constructor stub
}
public Triangle(Double base, Double height) {
	super();
	this.base = base;
	this.height = height;
}
public void computeArea() {
	area=0.5*base*height;
	System.out.println("Area of the Triangle"+area);
}
}
