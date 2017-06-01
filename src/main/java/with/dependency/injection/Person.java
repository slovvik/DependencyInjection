package with.dependency.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by barteks on 01/06/2017.
 */
@Component
public class Person {

    @Autowired
    Email email;
//
//    public Person() {
//    }
//
//    @Autowired
//    public Person(Email email) {
//        this.email = email;
//    }

//    @Autowired
//    public void setEmail(Email email) {
//        this.email = email;
//    }

    public void replay() {
        email.sendEmail("Bug", "It works for me.");
    }
}
