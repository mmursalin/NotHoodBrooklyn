package DreamCar;

public class MyDreamCar {

	String type="Tesla";
	String model="Model S P100D";
	int year=2020;
	int price=150000;
	
	// Constructor #1
	
	public MyDreamCar() {
		
	}

	// Constructor #2
	
	public MyDreamCar
		(String type) {
		this.type=type;
		System.out.println(type);	
	}
	
	// Constructor #3
	public MyDreamCar
		(String type, int year) {
		this.type=type;
		this.year=year;
		System.out.println(type+""+year);
	}
	
	// Constructor #4
		public MyDreamCar
			(String type, int year, int price) {
			this.type=type;
			this.year=year;
			this.price=price;
			
			System.out.println(type+""+year+""+price);
		}
	
		public void DisplayCarName() {
		System.out.println("My dream car brand is: "+type);
	}
		public void DisplayModel() {
		System.out.println("My dream car model is: "+model);
	}
		public void DisplayYear() {
		System.out.println("I am hoping to buy it in: "+year);
	}
		public void DisplayPrice() {
		System.out.println("The price of my dream car is: "+price);
	}
}
