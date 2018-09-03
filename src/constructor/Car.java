package constructor;

public class Car {

	
	String type="Honda";
	String model="Civic";
	int year=2018;
	int price=20000;
	
	// Constructor #1
	
	public Car() {
		
	}

	// Constructor #2
	
	public Car
		(String type) {
		this.type=type;
		System.out.println(type);	
	}
	
	// Constructor #3
	public Car
		(String type, int year) {
		this.type=type;
		this.year=year;
		System.out.println(type+""+year);
	}
	
	// Constructor #4
		public Car
			(String type, int year, int price) {
			this.type=type;
			this.year=year;
			this.price=price;
			
			System.out.println(type+""+year+""+price);
		}
	
		public void DisplayCarName() {
		System.out.println("My car name is: "+type);
	}
		public void DisplayModel() {
		System.out.println("My car model is: "+model);
	}
		public void DisplayYear() {
		System.out.println("My car year is: "+year);
	}
		public void DisplayPrice() {
		System.out.println("My car price is: "+price);
	}
}
