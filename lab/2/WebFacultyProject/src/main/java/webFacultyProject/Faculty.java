package webFacultyProject;

public class Faculty {
	private Integer f_id;
	private String f_Lname;
	private String f_Fname;
	private double f_salary;
	private double f_bonusRate;
	
	public Faculty() {
		super();
		this.f_id = 0;
		this.f_Lname = "";
		this.f_Fname = "";
		this.f_salary = 0;
		this.f_bonusRate = 0;
	}
	
	public Faculty(Integer f_id, String f_Lname, String f_Fname, double f_salary, double f_bonusRate) {
		this.f_id = f_id;
		this.f_Lname = f_Lname;
		this.f_Fname = f_Fname;
		this.f_salary = f_salary;
		this.f_bonusRate = f_bonusRate;
	}
	
	public Integer getF_id() {
		return f_id;
	}

	public void setF_id(Integer f_id) {
		this.f_id = f_id;
	}

	public String getF_Lname() {
		return f_Lname;
	}

	public void setF_Lname(String f_Lname) {
		this.f_Lname = f_Lname;
	}

	public String getF_Fname() {
		return f_Fname;
	}

	public void setF_Fname(String f_Fname) {
		this.f_Fname = f_Fname;
	}

	public double getF_salary() {
		return f_salary;
	}

	public void setF_salary(double f_salary) {
		this.f_salary = f_salary;
	}

	public double getF_bonusRate() {
		return f_bonusRate;
	}

	public void setF_bonusRate(double f_bonusRate) {
		this.f_bonusRate = f_bonusRate;
	}

	@Override
	public String toString() {
		return "Faculty [f_id=" + f_id + ", f_Lname=" + f_Lname + ", f_Fname=" + f_Fname + ", f_salary=" + f_salary
				+ ", f_bonusRate=" + f_bonusRate + "]";
	}
	
	public double Calculate_Total() {
		return f_salary * f_bonusRate;
	}
}
