package ex11_2;


class Student extends Person {
    private static final String STATUS = "Undergraduate";

    public Student(String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
}

    
    


