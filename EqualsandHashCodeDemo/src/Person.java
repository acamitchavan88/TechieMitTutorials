import java.util.Objects;

public class Person {

	
	

	private int personAge;
	private String personName;
	private String personAddress;
	public Person()
	{
		
	}
	
	public Person(int personAge, String personName, String personAddress) {
		super();
		this.personAge = personAge;
		this.personName = personName;
		this.personAddress = personAddress;
	}
	
	public int getPersonAge() {
		return personAge;
	}
	@Override
	public int hashCode() {
		return Objects.hash(personAddress, personAge, personName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(personAddress, other.personAddress)
				&& personAge == other.personAge
				&& Objects.equals(personName, other.personName);
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonAddress() {
		return personAddress;
	}
	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}
	
	
}
