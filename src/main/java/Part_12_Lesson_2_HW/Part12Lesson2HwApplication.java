package Part_12_Lesson_2_HW;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Part12Lesson2HwApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Part12Lesson2HwApplication.class, args);

		TicketNumberGenerator generator = context.getBean(TicketNumberGenerator.class);
		System.out.println(generator.createNewNumber());
		System.out.println(generator.createNewNumber());
		System.out.println(generator.createNewNumber());
		System.out.println();
		System.out.println(context.getBean(ScoreBoard.class).newTicket() + "\n");
		System.out.println(context.getBean(ScoreBoard.class).newTicket() + "\n");
		System.out.println(context.getBean(ScoreBoard.class).newTicket() + "\n");


	}

}
