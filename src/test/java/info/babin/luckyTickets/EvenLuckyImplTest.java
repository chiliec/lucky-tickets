package info.babin.luckyTickets;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Набор тестов для класса {@link EvenLuckyImpl}
 */
public class EvenLuckyImplTest {

    /**
     * Проверяет, что конструктор генерирует билет для корректных данных (номер билета)
     */
    @Test
    public void ticketConstructorNormallyWorks() {
        // given

        // when
        Lucky ticket = new EvenLuckyImpl(10);

        // then
        assertNotNull(ticket);
    }

    /**
     * Минимальный номер билета (0) создается корректно
     */
    @Test
    public void minimumTicketNumber() {
        // given

        // when
        Lucky ticket = new EvenLuckyImpl(0);

        // then
        assertNotNull(ticket);
    }

    /**
     * Максимальный номер билета (9999 в даном случае) создается корректно
     */
    @Test
    public void maximumTicketNumber() {
        // given

        // when
        Lucky ticket = new EvenLuckyImpl(9_999);

        // then
        assertNotNull(ticket);
    }

    /**
     * Проверяет, что, если на вход конструктору поступило отрицательное число,
     * то выкидываем исключение {@link IllegalArgumentException}
     */
    @Test
    public void negativeTicket() {
        Exception exception = null;
        try {
            Lucky ticket = new EvenLuckyImpl(-1);
        } catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        assertEquals(IllegalArgumentException.class, exception.getClass());
        assertEquals("Попытка создать билет с отрицательным номером!", exception.getMessage());
    }

    /**
     * Проверяет что будет если подали на вход слишком большое число
     */
    @Test
    public void moreThanFourDigitNumberTicket() {
        Exception exception = null;
        try {
            new EvenLuckyImpl(10000);
        } catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        assertEquals(IllegalArgumentException.class, exception.getClass());
        assertEquals("Попытка создать билет со слишком большим номером!", exception.getMessage());
    }

    /**
     * Проверяем что счастливый билет определяется правильно
     */
    @Test
    public void ticketIsLucky() {
        Lucky ticket = new EvenLuckyImpl(1560);
        assertTrue(ticket.isLucky());
    }

    /**
     * Проверяем что несчастливый билет определяется правильно
     */
    @Test
    public void ticketIsNotLucky() {
        Lucky ticket = new EvenLuckyImpl(1951);
        assertFalse(ticket.isLucky());
    }
}
