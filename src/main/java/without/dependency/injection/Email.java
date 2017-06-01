package without.dependency.injection;

import org.springframework.stereotype.Component;

/**
 * Created by barteks on 01/06/2017.
 */
public class Email {

    public void sendEmail(String title, String message) {
        System.out.format("Title: \"%s\"\nMessage: \"%s\"", title, message);
    }
}
