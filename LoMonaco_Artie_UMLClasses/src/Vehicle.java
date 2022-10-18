
public class Vehicle {
	//instance variables
	private String type;
	private String manufacturer;
	private String model;
	private short year;
	private String colour;
	private byte numOfDoors;
	private float gasTankSize;
	private float gas;
	private int km;
	
	//constructor
	public Vehicle(String typ, String manu, String mod, short yea, String col, byte nDoors, float tankS) {
		type = typ;
		manufacturer = manu;
		model = mod;
		year = yea;
		colour = col;
		numOfDoors = nDoors;
		gasTankSize = tankS;
		gas = 0.0f;
		km = 0;
	}
	
	//setter method
	public void paint(String col) {
		colour = col;
	}
	
	//add methods
	public void gasUp(int litres) {
		gas += litres;
		
		//don't over-fill the gas tank capacity
		if (gas > gasTankSize) {
			gas = gasTankSize;
		}
	}
	
	public boolean drive(int distance) {
		km += distance;
		
		//assuming it's 1L/km
		gas -= distance;
		
		if (gas < 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	//getter methods
	public String getType() {
		return type;
	}

	public String getManufact() {
		return manufacturer;
	}

	public String getModel() {
		return model;
	}

	public short getYear() {
		return year;
	}
}
