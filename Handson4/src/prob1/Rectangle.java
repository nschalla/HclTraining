package prob1;

public class Rectangle extends Shape{
 Float length,breadth;
 
	public Rectangle(Float length, Float breadth) {
	super();
	this.length = length;
	this.breadth = breadth;
}

	public Rectangle() {
	super();
}

	@Override
	public Double calculatePerimeter() {
		return (double) (4*length*breadth);
	}

}
