
public class Car {
	
	int year;
	String make;
	String model;
	int mielage;
	int doors;
	String titleStatus;
	
	
	
	public Car(int year, String make, String model, int mielage, int doors, String titleStatus) {
		super();
		this.year = year;
		this.make = make;
		this.model = model;
		this.mielage = mielage;
		this.doors = doors;
		this.titleStatus = titleStatus;
	}
	
	public void print() {
		System.out.println(this.year+ " " +this.make+ " " +this.model+ ", " +this.mielage+ " miles, " +this.doors+ " doors, " +this.titleStatus+ " title");
	}

}
