package info.babin.luckyTickets.builders;

import info.babin.luckyTickets.Lucky;

/**
 * Строитель экземпляров, реализующих {@link info.babin.luckyTickets.Lucky}
 */
public interface MealTicketBuilder {
    /**
     *
     * @return {@link Lucky}
     */
    Lucky build();

    /**
     * Фиксирует порядковый номер билета
     *
     * @param ticket
     */
    MealTicketBuilder ticket(long ticket);
}
