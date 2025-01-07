public class Employee {

    // Instance variables
    private int id;
    private String firstName;
    private String lastName;
    private String address;

    // Default constructor
    public Employee() {
        this.id = 0;
        this.firstName = "";
        this.lastName = "";
        this.address = "";
    }

    // Parameterized constructor
    public Employee(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // Method to get full name
    public String getFullName() {
        return firstName + " " + lastName;
    }

    // Getters and Setters for each instance variable (Optional for better encapsulation)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Using the default constructor
        Employee emp1 = new Employee();
        emp1.setFirstName("John");
        emp1.setLastName("Doe");
        emp1.setAddress("123 Main St");
        emp1.setId(101);

        // Using the parameterized constructor
        Employee emp2 = new Employee(102, "Jane", "Smith", "456 Elm St");

        // Printing the full name using getFullName()
        System.out.println("Employee 1 Full Name: " + emp1.getFullName());
        System.out.println("Employee 2 Full Name: " + emp2.getFullName());
    }
}
