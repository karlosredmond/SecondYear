package Lab5;

public class StudentTest {
	public static void main(String[] args){
		Student studArray[] = new Student[10] ;
		
		for(int i = 0; i < studArray.length; i++){
			studArray[i] = new Student("Joe Bloggs", "Carlow It","KCCOMCP", "Male") ;
		}
		for(int i = 0; i < studArray.length; i++){
			System.out.println(studArray[i].toString()) ;
		}
		for(int i = 0; i < studArray.length; i++){
			studArray[i].newYear() ;
		}
		for(int i = 0; i < studArray.length; i++){
			System.out.println(studArray[i].toString()) ;
		}
		for(int i = 0; i < studArray.length; i++){
			studArray[i].newYear() ;
		}
		for(int i = 0; i < studArray.length; i++){
			System.out.println(studArray[i].toString()) ;
		}
		studArray[0].getCourse().getCourseSubjects() ;
	
	}
}
