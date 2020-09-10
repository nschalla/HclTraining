package prb3;

public class Circle extends Shape {
private Double radius,area;

public Circle(Double radius) {
	super();
	this.radius = radius;
}

public Circle() {
	super();
}

public void computeArea() {
	area=3.14*radius*radius;
	System.out.println("Area of the circle :"+area);
}
}
