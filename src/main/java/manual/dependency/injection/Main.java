package manual.dependency.injection;

/**
 * Created by barteks on 01/06/2017.
 */
public class Main {

    public static void main(String[] args) {

        Email email = new Email();
        Person person = new Person(email);

        // OR
        Person setterPerson = new Person();
        setterPerson.setEmail(email);

        person.replay();
        setterPerson.replay();
    }
}
