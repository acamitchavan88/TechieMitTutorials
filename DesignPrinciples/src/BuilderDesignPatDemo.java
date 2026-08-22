/* Author #TechieMit:Program to demonstrate usage of Builder Design Pattern in Java with example
 * 
 */

 
public class BuilderDesignPatDemo {

	public static void main(String[] args) {
		//Create an array of String of hobbies
		String[] studentHobbies= {"Reading","Painting","Playing Cricket"};
		 Student studentObject=new Student.StudentBuilder().studentAge(12)
				 .studentName("Keshav Mahajan")
				 .studentGrade("A")
				 .studentId("34")
				 .studentBloodGroup("B+")
				 .studentHomeAddress("Walkvekar Nagar Pune")
				 .studentCollegeAddress("Kelewadi")
				 .studentClass("FYJC")
				 .studentHobbies(studentHobbies)
				 .studentPercentage(77.88d).build();
		 System.out.println("Student data is " + "\n"+
				 studentObject);
	}

}
