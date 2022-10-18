
public class Course {
	//instance variables
	private String code;
	private String name;
	private String level;
	private float mark;
	private String status;
	private byte lates;
	private byte absences;
	
	//constructor
	public Course(String c, String n, String lev){
		code = c;
		name = n;
		level = lev;
		mark = 0;
		status = "";
		lates = 0;
		absences = 0;
	}
	
	//setter methods
	public boolean setMark(float m) {
		mark = m;
		return true;
	}

	public boolean setStatus(String s) {
		status = s;
		return true;
	}
	
	//add methods
	public void addLates(byte num) {
		lates += num;
	}
	
	public void addAbsences(byte num) {
		absences += num;
	}
	
	//getter methods
	public String getMarkG() {
		if (mark >= 90) {
			return "A+";
		}
		else if (mark >= 85) {
			return "A";
		}
		else if (mark >= 80) {
			return "A-";
		}
		else if (mark >= 77) {
			return "B+";
		}
		else if (mark >= 73) {
			return "B";
		}
		else if (mark >= 70) {
			return "B-";
		}
		else if (mark >= 67) {
			return "C+";
		}
		else if (mark >= 63) {
			return "C";
		}
		else if (mark >= 60) {
			return "C-";
		}
		else if (mark >= 57) {
			return "D+";
		}
		else if (mark >= 53) {
			return "D";
		}
		else if (mark >= 50) {
			return "D-";
		}
		else {
			return "F";
		}
	}
	
	public float getMark() {
		return mark;
	}

	public String getStatus() {
		return status;
	}

	public String getLevel() {
		return level;
	}
	
	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public byte getLates() {
		return lates;
	}

	public byte getAbsences() {
		return absences;
	}
}
