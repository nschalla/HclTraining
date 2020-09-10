package prob1;

public class Square extends Shape{
	Float side;
	
	public Square(Float side) {
		super();
		this.side = side;
	}

	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calculatePerimeter() {
		// TODO Auto-generated method stub
		return (double) (4*side);
	}

}
