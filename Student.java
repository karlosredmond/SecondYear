/**
 * 
 */
package Lab5;

/**
 * @author Karl Redmond
 *
 */
public class Student {
	private final int levy = 100 ;
	private final int flat = 500 ;
	private int year = 0 ;
	private String Id = "C00" + studentsId ;
	private String name;
	private String address;
	private Course course;
	private String gender;
	private int fees ;
	private static int studentsId = 196815;
	
	public Student(){
		
	}
	public Student(String name, String address,String course, String gender){
		this.setId();
		this.setYear();
		this.setName(name) ;
		this.setAddress(address) ;
		this.setCourse(course) ;
		this.setGender(gender);
		this.setFees();
		
	}

	@Override
	public String toString() {
		return "Student [year=" + year + ", Id=" + Id + ", name=" + name
				+ ", address=" + address + ", course=" + course.getCode() + ", gender="
				+ gender + ", fees=" + fees + "]";
	}
	public int getYear() {
		return year;
	}
	public void setYear() {
		this.year = ++year;
		
	}
	public void newYear() {
		this.year = ++year;
		setFees();
	}
	public String getId() {
		return Id;
	}
	public void setId() {
		this.Id = getId();
		studentsId++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = new Course("Computing", 4,course,"CAN");
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setFees(){
		switch(this.year){
		case 1:
			this.fees = flat ;
			break;
		case 2: case 3: case 4: case 5: case 6: case 7:
			this.fees = flat + (levy * year) - levy ;
			break;
		}
	}
	public int getFees(){
		return fees ;
	}
	
}
