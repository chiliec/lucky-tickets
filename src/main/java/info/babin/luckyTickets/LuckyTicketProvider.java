package info.babin.luckyTickets;

public class LuckyTicketProvider implements LuckyProvider {
    /**
     * @param n номер объекта кандидата
     * @return Lucky
     */
    @Override
    public Lucky get(long n) {
        return new LuckyImpl(n);
    }
}
