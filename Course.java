package Lab5;

public class Course {
	private String[] courseSubjects = new String[7] ;
	private String name;
	private int duration;
	private String code;
	private String department;

	public Course( String name, int duration) {
		setCourseSubjects();
		this.setName(name);
		this.setDuration(duration);
		this.setCode(code);
		this.setDepartment(department) ;
	}
	public Course(String name, int duration, String code,String department) {
		this.setCourseSubjects();
		this.setName(name);
		this.setDuration(duration);
		this.setCode(code);
		this.setDepartment(department) ;
	}

	public void getCourseSubjects() {
		System.out.println(courseSubjects[0]);
		System.out.println(courseSubjects[1]);
		System.out.println(courseSubjects[2]);
		System.out.println(courseSubjects[3]);
		System.out.println(courseSubjects[4]);
		System.out.println(courseSubjects[5]);
		System.out.println(courseSubjects[6]);
	}

	public void setCourseSubjects() {
		this.courseSubjects[0] = "Maths";
		this.courseSubjects[1] = "Java";
		this.courseSubjects[2] = "Comp Arch";
		this.courseSubjects[3] = "Sys Anal";
		this.courseSubjects[4] = "Mana Acc";
		this.courseSubjects[5] = "Project";
		this.courseSubjects[6] = "Web Dev";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = (duration != 0 ? duration : 0);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
}
