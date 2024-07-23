import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable {
    private static int id_gen = 1;
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private boolean gender;

    public Person() {
        this.id = id_gen++;
    }

    public Person(String firstName, String lastName, LocalDate dateOfBirth, boolean gender) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public int getId() {
        return id;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return (this.gender) ? "male" : "female";
    }

    @Override
    public String toString() {
        return "Person [id = " + id +
                ", firstName = " + firstName +
                ", lastName = " + lastName +
                ", dateOfBirth = " + dateOfBirth +
                ", gender = " + ((gender) ? "male" : "female") +"]";
    }
}
