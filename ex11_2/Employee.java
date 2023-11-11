package ex11_2;
import java.time.*;


class Employee extends Person {
    private String office;
    private double salary;
    private LocalDate  dateHired;

    

    public Employee(String name, String address, String phoneNumber, String emailAddress,
                    String office, double salary, LocalDate dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }
}
