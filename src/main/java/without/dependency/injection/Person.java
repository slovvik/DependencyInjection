package without.dependency.injection;

public class Person {

    Email email;

    public Person() {
        email = new Email();
    }

    public void replay() {
        email.sendEmail("Bug", "It works for me.");
    }
}
