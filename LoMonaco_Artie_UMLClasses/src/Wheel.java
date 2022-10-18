
public class Wheel {
	//instance variables
	private String brand;
	private String model;
	private int size;
	private String season;
	private int KM_usage;
	private String tread_condition;
	
	//constructor
	public Wheel(String br, String mod, int siz, String sea) {
		brand = br;
		model = mod;
		size = siz;
		season = sea;
		KM_usage = 0;
		tread_condition = "new";
	}
	
	//setter method
	public void update_KM_usage(int km) {
		KM_usage = km;
	}
	
	//getter methods
	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getSize() {
		return size;
	}

	public String getSeason() {
		return season;
	}

	public int getKM() {
		return KM_usage;
	}

	public String getTreadCondition() {
		return tread_condition;
	}

}
