import java.io.*;
import java.time.LocalDate;

public class WriteObject {
    public static void main(String[] args) {

        Person person1 = new Person("John", "Doe", LocalDate.of(1990, 1, 1), true);
        Person person2 = new Person("Jane", "Doe", LocalDate.of(1995, 1, 1), false);
        Person person3 = new Person("Alice", "Doe", LocalDate.of(2000, 1, 1), false);
        Person person4 = new Person("Bob", "Doe", LocalDate.of(2005, 1, 1), true);


        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("src/people.bin");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(person1);
            objectOutputStream.writeObject(person2);
            objectOutputStream.writeObject(person3);
            objectOutputStream.writeObject(person4);

            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
