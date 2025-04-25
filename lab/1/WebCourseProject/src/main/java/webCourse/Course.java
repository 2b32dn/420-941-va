package webCourse;

public class Course {
	private String course_no;
	private String course_name;
	private Integer max_enrl;
	public static Integer credits;
	
	// Constructor
	public Course() {
		this.course_no = "";
		this.course_name = "";
		this.max_enrl = 0;
		Course.credits = 3;
	}
	
	public Course(String course_no, String course_name, Integer max_enrl) {
		this.course_no = course_no;
		this.course_name = course_name;
		this.max_enrl = max_enrl;
		Course.credits = 3;
	}

	public String getCourse_no() {
		return course_no;
	}

	public void setCourse_no(String course_no) {
		this.course_no = course_no;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public Integer getMax_enrl() {
		return max_enrl;
	}

	public void setMax_enrl(Integer max_enrl) {
		this.max_enrl = max_enrl;
	}

	public static Integer getCredits() {
		return credits;
	}

	public static void setCredits(Integer credits) {
		Course.credits = credits;
	}
	
	// Methods
	public double CalculateTotalFees() {
		return max_enrl * 250;
	}
}


