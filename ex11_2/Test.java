package ex11_2;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("John Doe", "123 Main St", "555-1234", "john.doe@email.com");
        Student student = new Student("Alice Smith", "456 Oak St", "555-5678", "alice.smith@email.com");
        Employee employee = new Employee("Bob Johnson", "789 Elm St", "555-9012", "bob.johnson@email.com",
                "Office 101", 50000, LocalDate.now());
        Faculty faculty = new Faculty("Eve Davis", "101 Pine St", "555-3456", "eve.davis@email.com",
                "Office 202", 70000,LocalDate.now(), "Monday 2-4 PM", "Professor");
        Staff staff = new Staff("Charlie Brown", "303 Birch St", "555-7890", "charlie.brown@email.com",
                "Office 303", 60000,LocalDate.now(), "Manager");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
