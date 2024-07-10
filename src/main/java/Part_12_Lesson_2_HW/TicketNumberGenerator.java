package Part_12_Lesson_2_HW;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Component
@Scope(ConfigurableListableBeanFactory.SCOPE_SINGLETON)
public class TicketNumberGenerator {

    public String createNewNumber() {
        return UUID.randomUUID().toString();
    }
}
