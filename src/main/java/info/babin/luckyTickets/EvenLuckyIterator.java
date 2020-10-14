package info.babin.luckyTickets;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service()
@Primary
public class EvenLuckyIterator implements Iterator<Lucky> {
    private static long MAX = 10_000;
    private LuckyProvider provider = new EvenTicketProvider();
    private long current = 0;

    @Override
    public boolean hasNext() {
        return current < MAX;
    }

    @Override
    public Lucky next() {
        Lucky lucky = provider.get(current);
        current += 2;
        return lucky;
    }
}
