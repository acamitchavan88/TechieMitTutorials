
public class EqualsandHashCodeDemo {

	public static void main(String[] args) {
		//Creation of person instance
		Person person=new Person();
		person.setPersonAge(12);
		person.setPersonAddress("KP Road");
		person.setPersonName("Ramesh Pawar");
		//Creation of newPerson instance
		Person newPerson=new Person();
		newPerson.setPersonAge(12);
		newPerson.setPersonAddress("KP Road");
		newPerson.setPersonName("Ramesh Pawar");
		System.out.println("Using deep binding  Objects person and newPerson are equal \t"+person.equals(newPerson));
		System.out.println("Using shallow binding Objects person and newPerson are equal \t"+(newPerson==person));
		
		System.out.println(" New Person hashCode value \t"+newPerson.hashCode());
		System.out.println(" Person hashCode value \t"+person.hashCode());
		
	}

}
