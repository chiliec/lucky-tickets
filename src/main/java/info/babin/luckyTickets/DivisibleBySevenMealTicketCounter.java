package info.babin.luckyTickets;

import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service
public class DivisibleBySevenMealTicketCounter extends MealTicketCounter {

    DivisibleBySevenMealTicketCounter(Iterator< Lucky > ticketIterator) {
        super(ticketIterator);
    }

    @Override
    public boolean doFilter(Lucky ticket) {
        return ticket.accept(hasOrdinal -> hasOrdinal.getOrdinal() % 7 == 0);
    }
}
