package Part_12_Lesson_2_HW;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Scope(ConfigurableListableBeanFactory.SCOPE_SINGLETON)
public class ScoreBoard {

    TicketNumberGenerator ticketNumberGenerator;

    public ScoreBoard(TicketNumberGenerator ticketNumberGenerator) {
        this.ticketNumberGenerator = ticketNumberGenerator;
    }

    public Ticket newTicket() {
        return new Ticket(ticketNumberGenerator.createNewNumber(), LocalDateTime.now());
    }
}
