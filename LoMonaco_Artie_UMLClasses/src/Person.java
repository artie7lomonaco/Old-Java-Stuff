//create class
public class Person {
	//instance variables
	private String fname;
	private String lname;
	private String DOB;
	private double height;
	private double weight;
	
	//constructor
	public Person(String first, String last, String dob, double h, double w) {
		fname = first;
		lname = last;
		DOB = dob;
		height = h;
		weight = w;
	}
	
	//setter methods
	public void setName(String first, String last) {
		fname = first;
		lname = last;
	}

	public boolean setWeight(double w) {
		weight = w;
		return true;
	}
	
	public boolean setHeight(double h) {
		height = h;
		return true;
	}
	
	//getter methods
	public String getName() {
		return (fname + " " + lname);
	}
	
	public String getDOB() {
		return (DOB);
	}
	
	public String getDOB_year() {
		String[] year = DOB.split("/");
		
		return year[2];
	}
	
	public String getDOB_month() {
		String[] month = DOB.split("/");
		
		return month[0];
	}
	
	public String getDOB_day() {
		String[] day = DOB.split("/");
		
		return day[1];
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	
}
