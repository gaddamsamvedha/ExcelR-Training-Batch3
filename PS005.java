import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    public Employee() { }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}

class CollectionMap {
    
    private Map<Integer, Employee> employeeMap;


    public CollectionMap() {
        this.employeeMap = new HashMap<>();
    }

    public Map<Integer, Employee> getEmployeeMap() {
        return employeeMap;
    }

    public void setEmployeeMap(Map<Integer, Employee> employeeMap) {
        this.employeeMap = employeeMap;
    }

    public int addEmployee(Employee emp) {
        if (emp == null) {
            return 1; 
        }
        if (employeeMap.containsKey(emp.getId())) {
            return 2;
        }
        employeeMap.put(emp.getId(), emp);
        return 0;
    }

    public int removeEmployee(int employeeId) {
        if (!employeeMap.containsKey(employeeId)) {
            return 2; 
        }
        employeeMap.remove(employeeId);
        return 0; 
    }

    public Employee findEmployee(int employeeId) {
        return employeeMap.getOrDefault(employeeId, null); 
    }

    public List<Employee> getEmployeeList() {
        if (employeeMap.isEmpty()) {
            return null; 
        }
        return new ArrayList<>(employeeMap.values()); 
    }
}

public class PS005 {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee(1, "John Doe", 50000);
        Employee emp2 = new Employee(2, "Jane Smith", 60000);
        Employee emp3 = new Employee(3, "Alice Johnson", 55000);

        CollectionMap collectionMap = new CollectionMap();


        System.out.println("Add emp1: " + collectionMap.addEmployee(emp1)); 
        System.out.println("Add emp2: " + collectionMap.addEmployee(emp2)); 
        System.out.println("Add emp3: " + collectionMap.addEmployee(emp3)); 
        System.out.println("Add duplicate emp1: " + collectionMap.addEmployee(emp1)); 

        
        System.out.println("Find emp1: " + collectionMap.findEmployee(1)); 
        System.out.println("Find non-existent emp4: " + collectionMap.findEmployee(4)); 


        System.out.println("Remove emp2: " + collectionMap.removeEmployee(2)); 
        System.out.println("Remove non-existent emp4: " + collectionMap.removeEmployee(4));

        
        List<Employee> employeeList = collectionMap.getEmployeeList();
        if (employeeList != null) {
            System.out.println("Employee List: ");
            for (Employee emp : employeeList) {
                System.out.println(emp);
            }
        } else {
            System.out.println("Employee List is empty.");
        }

        CollectionMap emptyMap = new CollectionMap();
        List<Employee> emptyList = emptyMap.getEmployeeList();
        if (emptyList == null) {
            System.out.println("Employee List is empty.");
        }
    }
}
