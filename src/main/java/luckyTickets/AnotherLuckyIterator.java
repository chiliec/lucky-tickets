package luckyTickets;

import java.util.Iterator;

public class AnotherLuckyIterator implements Iterator<Lucky> {
    private static long MAX = 10_000;
    private LuckyProvider provider = new AnotherTicketProvider();
    private long current = 0;

    @Override
    public boolean hasNext() {
        return current < MAX;
    }

    @Override
    public Lucky next() {
        Lucky lucky = provider.get(current);
        current++;
        return lucky;
    }
}
