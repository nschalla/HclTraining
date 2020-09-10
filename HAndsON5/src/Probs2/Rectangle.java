package Probs2;

public class Rectangle implements Polygon{
double length,breadth;

@Override
public double calcperi() {
	// TODO Auto-generated method stub
	return 2*length*breadth;
}

@Override
public double calcArea() {
	// TODO Auto-generated method stub
	return length*breadth;
}

public Rectangle(double length, double breadth) {
	super();
	this.length = length;
	this.breadth = breadth;
}

public Rectangle() {
	super();
	// TODO Auto-generated constructor stub
}

}
