package info.babin.luckyTickets;

/**
 * Предоставляет метод, возвращяющий номер
 */
public interface HasOrdinal {
    /**
     * Дефолтная реализация, при необходимости переопределить!
     * @return подрядковый номер
     */
    default Long getOrdinal() {
        return null;
    }
}
