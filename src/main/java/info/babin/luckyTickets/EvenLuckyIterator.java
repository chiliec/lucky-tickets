package info.babin.luckyTickets;

import info.babin.luckyTickets.builders.TicketBuilder;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service()
@Primary
public class EvenLuckyIterator implements Iterator<Lucky>, ApplicationContextAware {
    private static long MAX = 10_000;
    private long current = 0;

    private ApplicationContext applicationContext;

    @Override
    public boolean hasNext() {
        return current < MAX;
    }

    @Override
    public Lucky next() {
        TicketBuilder ticketBuilder = applicationContext.getBean("ticketBuilder", TicketBuilder.class);
        Lucky lucky = ticketBuilder.ticket(current).build();
        current += 2;
        return lucky;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
