import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class WriteObject {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        Person person1 = new Person("John", "Doe", LocalDate.of(1990, 1, 1), true);
        Person person2 = new Person("Jane", "Doe", LocalDate.of(1995, 1, 1), false);
        Person person3 = new Person("Alice", "Doe", LocalDate.of(2000, 1, 1), false);
        Person person4 = new Person("Bob", "Doe", LocalDate.of(2005, 1, 1), true);

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("src/people.bin");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeInt(people.size());

            for (Person person : people) {
                objectOutputStream.writeObject(person);
            }

            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
