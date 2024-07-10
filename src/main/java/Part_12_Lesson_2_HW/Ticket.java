package Part_12_Lesson_2_HW;

import java.time.LocalDateTime;

public class Ticket {

    String number;
    LocalDateTime createdAt;

    public Ticket(String number, LocalDateTime createdAt) {
        this.number = number;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "number='" + number + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
