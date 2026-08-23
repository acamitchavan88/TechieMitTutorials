import java.util.Arrays;

//Step 1 :Create POJO class with attributes and toString() method
//Step 2:Create Builder class with 
class Student
{
	

//Attributes are there
	private String studentName;
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentAge=" + studentAge + ", studentHomeAddress="
				+ studentHomeAddress + ", studentCollegeAddress=" + studentCollegeAddress + ", studentBloodGroup="
				+ studentBloodGroup + ", studentHobbies=" + Arrays.toString(studentHobbies) + ", studentId=" + studentId
				+ ", studentGrade=" + studentGrade + ", studentPercentage=" + studentPercentage + ", studentClass="
				+ studentClass + "]";
	}



	private Integer studentAge;
	private String studentHomeAddress;
	private String studentCollegeAddress;
	private String studentBloodGroup;
	private String[] studentHobbies;
	private String studentId;
	private String studentGrade;
	private Double studentPercentage;
	private String studentClass;
	
	//Private Constructor
	private Student(StudentBuilder studentBuilder)
	{
		
		this.studentName=studentBuilder.studentName;
		this.studentAge=studentBuilder.studentAge;
		this.studentHomeAddress=studentBuilder.studentHomeAddress;
		this.studentCollegeAddress=studentBuilder.studentCollegeAddress;
		this.studentBloodGroup=studentBuilder.studentBloodGroup;
		this.studentHobbies=studentBuilder.studentHobbies;
		this.studentId=studentBuilder.studentId;
		this.studentGrade=studentBuilder.studentGrade;
		this.studentPercentage=studentBuilder.studentPercentage;
		this.studentClass=studentBuilder.studentClass;
		
	}



//Static Step 3 
public static class StudentBuilder
{
	 private String studentName;
		
		private Integer studentAge;
		private String studentHomeAddress;
		private String studentCollegeAddress;
		private String studentBloodGroup;
		private String studentHobbies[];
		private String studentId;
		private String studentGrade;
		private Double studentPercentage;
		private String studentClass;

		//Step 4
		public StudentBuilder studentClass(String studentClass)
		{
			this.studentClass=studentClass;
			return this;
		}
		public StudentBuilder studentName(String studentName)
		{
			this.studentName=studentName;
			return this;
		}
		public StudentBuilder studentAge(Integer studentAge)
		{
			this.studentAge=studentAge;
			return this;
		
		}
		public StudentBuilder studentHomeAddress(String studentHomeAddress)
		{
			this.studentHomeAddress=studentHomeAddress;
			return this;
		}
		public StudentBuilder studentCollegeAddress(String studentCollegeAddress)
		{
			this.studentCollegeAddress=studentCollegeAddress;
			return this;
		
		}
		public StudentBuilder studentBloodGroup(String studentBloodGroup)
		{
			this.studentBloodGroup=studentBloodGroup;
			return this;
		}
		public StudentBuilder studentHobbies(String[] studentHobbies)
		{
			this.studentHobbies=studentHobbies;
			return this;
		}
		public StudentBuilder studentId(String studentId)
		{
			this.studentId=studentId;
			return this;
		}
		public StudentBuilder studentGrade(String studentGrade)
		{
			this.studentGrade=studentGrade;
			return this;
		}
		public StudentBuilder studentPercentage(Double studentPercentage)
		{
			this.studentPercentage=studentPercentage;
			return this;
		}
		
		//Build method of builder class
		public Student build()
		{
			return new Student(this);
		}
		
}

}