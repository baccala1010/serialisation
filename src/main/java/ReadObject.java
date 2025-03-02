import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/people.bin"))) {
            people = (ArrayList<Person>) objectInputStream.readObject();

            System.out.println(people);

        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}