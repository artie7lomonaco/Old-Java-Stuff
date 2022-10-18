public class UMLClasses {
	public static void main(String[] args) {
		//1. vehicle objects
		byte door = 4;
		short year = 1995;
				
		Vehicle toyota = new Vehicle("Car", "Toyota", "Corona", year, "Blue", door, 50.0f);
		Vehicle honda = new Vehicle("Car", "Honda", "Civic", year, "Blue", door, 40.0f);
		
		//2. person objects
		Person bob = new Person("Bob", "The Builder", "01/30/1998", 154.2, 55.3);
		Person caillou = new Person("Caillou", "The Kid", "04/28/2016", 100.2, 35.2);
		
	}
}
