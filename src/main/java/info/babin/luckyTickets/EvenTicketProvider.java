package info.babin.luckyTickets;

public class EvenTicketProvider implements LuckyProvider {
    /**
     * @param n номер объекта кандидата
     * @return Lucky
     */
    @Override
    public Lucky get(long n) {
        return new EvenLuckyImpl(n);
    }
}
