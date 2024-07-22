import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObject {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        ArrayList<Person> people = new ArrayList<>();

        try {
            fileInputStream = new FileInputStream("src/people.bin");
            objectInputStream = new ObjectInputStream(fileInputStream);

            Person person1 = (Person) objectInputStream.readObject();
            Person person2 = (Person) objectInputStream.readObject();
            Person person3 = (Person) objectInputStream.readObject();
            Person person4 = (Person) objectInputStream.readObject();

            people.add(person1);
            people.add(person2);
            people.add(person3);
            people.add(person4);

            for (Person person : people) {
                System.out.println(person);
            }


            objectInputStream.close();
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}