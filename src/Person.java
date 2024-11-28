import java.util.Date;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Date birthDate;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        // this.age = birthDate and subtract from now!
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

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getAge() {
        return age;
    }

    public void gettingOlder(){
        // age = age + 1;
        age++;
    }
}
