package question3;

public class Rectangale implements Shape {
	private double length;
	private double breadth;
	
	
	public Rectangale(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}


	public double area()
	{
		return this.length*this.breadth;
	}
}
