package info.babin.luckyTickets;

import java.util.Iterator;

public class LuckyIterator implements Iterator<Lucky> {
    private static long MAX = 1_000_000;
    private LuckyProvider provider = new LuckyTicketProvider();
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
