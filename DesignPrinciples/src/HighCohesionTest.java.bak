/*
 * #TechieMit program of Java8 program to demonstrate use of high cohesion
 */  
import java.util.*;
import java.util.stream.Collectors;

// Highly cohesive class: only stores Employee data
class Employee {
    private String empName;
    private int empAge;
    private double empSalary;

    public Employee(String empName, int empAge, double empSalary) {
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

    public String getEmpName() { return empName; }
    public int getEmpAge() { return empAge; }
    public double getEmpSalary() { return empSalary; }

    @Override
    public String toString() {
        return empName + " (Age: " + empAge + ", Salary: " + empSalary + ")";
    }
}

// Highly cohesive class: only stores and retrieves Employee data
class EmployeeRepository {
    private List<Employee> Employees;

    public EmployeeRepository() {
        Employees = Arrays.asList(
            new Employee("Jack David", 28, 85000),
            new Employee("Neha Sharma", 26, 72000),
            new Employee("Ravi Verma", 34, 134000),
            new Employee("John Carlsen", 20,29000 )
        );
    }

    public List<Employee> getAllEmployees() {
        return Employees;
    }
}

// Highly cohesive class: only handles business logic
class EmployeeService {
    public List<Employee> getFilteredEmployees(List<Employee> Employees, double empSalary) {
        return Employees.stream()
                       .filter(s -> s.getEmpSalary()>=50000)
                       .collect(Collectors.toList());
    }

    public double getAverageSalary(List<Employee> Employees) {
        return Employees.stream()
                       .mapToDouble(Employee::getEmpSalary)
                       .average()
                       .orElse(0.0);
    }
    
    //Provide list of all employees in descending order
    
    public List<Double> getEmpSalariesDescOrder(List<Employee> empList)
    {
    	return empList.stream().map(Employee::getEmpSalary).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    	//return empList.stream().map(Employee::getEmpSalary).sorted(Collections.reverseOrder()).collect(Collectors.toList());
    }
  
}

// Only responsible for starting the program
public class HighCohesionTest {
    public static void main(String[] args) {
        EmployeeRepository repository = new EmployeeRepository();
        EmployeeService service = new EmployeeService();

        List<Employee> allEmployees = repository.getAllEmployees();

        System.out.println("List of All Employees in ABC Company is::");
        allEmployees.forEach(System.out::println);

        System.out.println("\n List of employees receiving salary above 50000 INR");
        service.getFilteredEmployees(allEmployees, 50000)
               .forEach(System.out::println);

        System.out.println("\n Average Salary of all Employees " + service.getAverageSalary(allEmployees));
      System.out.println("\n List of Employees in  desceding order salaries");
      service.getEmpSalariesDescOrder(allEmployees).forEach(System.out::println);
        
    }
}
