import java.io.Serializable;

public class Person implements Serializable {
    int id;
    String name;
    String surname;
    PhoneNumber phoneNumber;

    public Person (int id, String name, String surname, PhoneNumber phoneNumber) {
        this.id = id;
        this.name = name;
        this.surname =  surname;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return  "Person info: {" +
                "id: " + id + " " +
                "name: " + name + " " +
                "surname: " + surname + " " +
                "phoneNumber: " + phoneNumber + " " +
                "}";
    }
}
