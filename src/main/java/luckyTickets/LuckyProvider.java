package luckyTickets;

/**
 * Предоставляет метод, возвращающий объекты, реализующие интерфейс {@link Lucky}
 */
public interface LuckyProvider {
    /**
     *
     * @param n номер объекта кандидата
     * @return Lucky
     */
    Lucky get(long n);
}
