package manual.dependency.injection;

/**
 * Created by barteks on 01/06/2017.
 */
public class Person {

    Email email;

    public Person(Email email) {
        this.email = email;
    }

    public Person() {
    }

    public void replay() {
        email.sendEmail("Bug", "It works for me.");
    }

    public void setEmail(Email email) {
        this.email = email;
    }
}
