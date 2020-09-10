package Probs2;

public class Square implements Polygon {
double side;

public Square(double side) {
	super();
	this.side = side;
}

public Square() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public double calcperi() {
	// TODO Auto-generated method stub
	return 4*side;
}

@Override
public double calcArea() {
	// TODO Auto-generated method stub
	return side*side;
}



}
