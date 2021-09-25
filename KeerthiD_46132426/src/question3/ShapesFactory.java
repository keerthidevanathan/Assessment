package question3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ShapesFactory {

	ArrayList<Shape> slist = new ArrayList<>();
	
	public static Shape ShapesFactory()
	{
		Scanner sc = new Scanner(System.in);
		int n = new Random().nextInt();
		switch(n%2)
		{
		case 0:
			System.out.println("Enter the radius");
			double radius = sc.nextDouble();
			return new Circle(radius);
			break;
		case 1:
			System.out.println("Enter the length");
			double length = sc.nextDouble();
			System.out.println("Enter the breadth");
			double breadth = sc.nextDouble();
			return new Rectangale(length,breadth);
			break;
		}
	}
}
