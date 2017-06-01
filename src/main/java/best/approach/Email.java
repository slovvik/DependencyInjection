package best.approach;

import org.springframework.stereotype.Component;

/**
 * Created by barteks on 01/06/2017.
 */
@Component
public class Email implements MessageService {

    @Override
    public void sendMessage(String title, String message) {
        System.out.format("MessageService used: %s\nTitle: \"%s\"\nMessage: \"%s\"", getClass().getSimpleName(), title, message);
    }
}
