import java.lang.Math;

public class CirArea {

	double val;
	double area;
	int c;
		
	public CirArea(int c,double val) {
		
		this.val = val;
		this.c=c;
			
	}

	
	
	public void area() {
		if(c==1) {
			area=Math.PI*Math.pow(val, 2);
			System.out.println("Area of the circle with Radius "+this.val+" is "+this.area);
		}
		
		else if(c==2){
			area=Math.PI*(Math.pow(val, 2))/4;
			System.out.println("Area of the circle with Diameter "+this.val+" is "+this.area);
		}
	}

	
	
	
}
