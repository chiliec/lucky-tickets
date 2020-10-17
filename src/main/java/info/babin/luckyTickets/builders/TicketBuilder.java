package info.babin.luckyTickets.builders;

import info.babin.luckyTickets.EvenLuckyImpl;
import info.babin.luckyTickets.Lucky;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Scope("prototype")
public class TicketBuilder implements MealTicketBuilder {
    private Long ticket;

    /**
     * Признак использования строителя
     */
    private boolean isUsed = false;

    @Override
    public Lucky build() {
        if (isUsed) {
            throw new IllegalStateException("Данный Строитель уже использовался!");
        }
        isUsed = true;
        return new EvenLuckyImpl(ticket);
    }

    @Override
    public MealTicketBuilder ticket(long ticket) {
        this.ticket = ticket;
        return this;
    }
}
