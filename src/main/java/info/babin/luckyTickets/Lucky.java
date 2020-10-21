package info.babin.luckyTickets;

/**
 * Предоставляет метод определения является ли объект "счастливым"
 */
public interface Lucky extends HasOrdinal, Visitable<HasOrdinal> {
    boolean isLucky();
}
