import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person1 = new Person(1, "Alex", "Akira",
                new PhoneNumber(7, 999, 1112233));
        System.out.println(person1);

        //Serialization
        var fileOutput = new FileOutputStream("ser_obj");
        var objectOutput = new ObjectOutputStream(fileOutput);
        objectOutput.writeObject(person1);
        fileOutput.flush();
        objectOutput.flush();

        //De-serialization
        var fileInput = new FileInputStream("ser_obj");
        var objectInput = new ObjectInputStream(fileInput);
        Person deserializeTarget = (Person) objectInput.readObject();
        fileInput.close();
        objectInput.close();

        System.out.println(deserializeTarget);
    }
}