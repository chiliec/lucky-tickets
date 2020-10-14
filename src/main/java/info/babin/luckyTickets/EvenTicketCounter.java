package info.babin.luckyTickets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.function.Supplier;

@Service
public class EvenTicketCounter implements Supplier<Long> {
    private final Iterator<Lucky> ticketIterator;

    @Autowired
    public EvenTicketCounter(Iterator<Lucky> ticketIterator) {
        this.ticketIterator = ticketIterator;
    }

    @Override
    public Long get() {
        long counter = 0L;
        while (ticketIterator.hasNext()) {
            Lucky next = ticketIterator.next();
            if (next.isLucky()) {
                counter++;
                System.out.println(next);
            }
        }
        return counter;
    }
}
