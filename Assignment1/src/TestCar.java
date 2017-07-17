
public class TestCar {

	public static void main(String[] args) {

		Car c1 = new Car(2004, "mazda", "mazda3", 133000, 4, "clean");
		Car c2 = new Car(2006, "volkswagon", "jetta", 148000, 4, "clean");
		Car c3 = new Car(2010, "Dodge", "Avenger", 168000, 4, "clean");

		c1.printDetails();
		c2.printDetails();
		c3.printDetails();
	}

}
