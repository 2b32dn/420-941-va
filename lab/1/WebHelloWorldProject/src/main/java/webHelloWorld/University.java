package webHelloWorld;
public class University {
	private String name;
	private Integer year;
	private Integer programs;
	
	// Default Constructor
	public University() {
		this.name = "";
		this.year = 0;
		this.programs = 0;
	}
	
	public University(String name, Integer year, Integer programs) {
		this.name = name;
		this.year = year;
		this.programs = programs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getPrograms() {
		return programs;
	}
	public void setPrograms(Integer programs) {
		this.programs = programs;
	}
	
	// Methods
	public String toString() {
		return String.format("[name=%s, yearOfExtablisher=%d, numOfPrograms=%d]\n",name, year, programs);
	}
}

