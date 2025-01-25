class Student {
    String name, address, phoneNo;

    Student(String name, String address, String phoneNo) {
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    void display() {
        System.out.println(name + " | " + address + " | " + phoneNo);
    }
}

public class Demo024 {
    public static void main(String[] args) {
        new Student("Sam", "123 BKD", "123-456-7890").display();
        new Student("Bindu", "456 BSWD", "234-567-8901").display();
        new Student("Samvedha", "789 HYD", "345-678-9012").display();
        new Student("Bhargavi", "101 ANDHRA", "456-789-0123").display();
        new Student("Sravanthi", "202 SHADNAGAR", "567-890-1234").display();
    }
}