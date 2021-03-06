import java.lang.Math;

public class Circle {

	double val;
	double area;
	int c;

	public Circle(int c, double val) {

		this.val = val;
		this.c = c;

	}

	public void area() {
		// if c==1 implies radius
		if (c == 1) {
			area = Math.PI * Math.pow(val, 2);
			System.out.println("Area of the circle with Radius " + this.val + " is " + this.area);
		}

		// if c==2 implies diameter
		else if (c == 2) {
			area = Math.PI * (Math.pow(val, 2)) / 4;
			System.out.println("Area of the circle with Diameter " + this.val + " is " + this.area);
		}
	}

}
