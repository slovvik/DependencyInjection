package best.approach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by barteks on 01/06/2017.
 */
@Component
public class Person {

    MessageService messageService;

    @Autowired
    public Person(@Qualifier("sms") MessageService messageService) {
        this.messageService = messageService;
    }

    public void replay() {
        messageService.sendMessage("Bug", "It works for me.");
    }
}
