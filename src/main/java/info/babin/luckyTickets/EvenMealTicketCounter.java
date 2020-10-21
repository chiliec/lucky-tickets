package info.babin.luckyTickets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service
public class EvenMealTicketCounter extends MealTicketCounter {

    @Autowired
    EvenMealTicketCounter(Iterator<Lucky> ticketIterator) {
        super(ticketIterator);
    }

    @Override
    public boolean doFilter(Lucky ticket) {
        return ticket.accept(hasOrdinal -> hasOrdinal.getOrdinal() % 2 == 0);
    }
}
