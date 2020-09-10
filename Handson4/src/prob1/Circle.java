package prob1;

public  class Circle extends Shape {
	Float radius;

	@Override
	public Double calculatePerimeter() {
		return this.radius*3.14;
	}

	public Circle(Float radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		super();
	}
	

}
