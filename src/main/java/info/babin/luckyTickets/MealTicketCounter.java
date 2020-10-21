package info.babin.luckyTickets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.function.Supplier;
import java.util.stream.StreamSupport;

/**
 * Реализует паттерн Шаблонный метод
 */
@Service
public class MealTicketCounter implements Supplier<Long> {
    private final Iterator<Lucky> ticketIterator;

    @Autowired
    MealTicketCounter(Iterator<Lucky> ticketIterator) {
        this.ticketIterator = ticketIterator;
    }

    @Override
    public Long get() {
        Iterable<Lucky> generator = () -> ticketIterator;
        return StreamSupport.stream(generator.spliterator(), false)
                .filter(Lucky::isLucky)
                .filter(this::doFilter)
                .peek(System.out::println)
                .count();
    }

    public boolean doFilter(Lucky ticket) {
        return true;
    }
}
