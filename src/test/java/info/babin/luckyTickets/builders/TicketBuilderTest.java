package info.babin.luckyTickets.builders;

import info.babin.luckyTickets.EvenLuckyImpl;
import info.babin.luckyTickets.Lucky;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Набор тестов для класса {@link TicketBuilder}
 */
public class TicketBuilderTest {

    /**
     * Проверяем что {@link TicketBuilder} создаётся
     */
    @Test
    public void constructorWorksWell() {
        MealTicketBuilder ticketBuilder = new TicketBuilder();
        assertNotNull(ticketBuilder);
    }

    /**
     * Проверяем что {@link TicketBuilder} возвращает себя
     * при подготовке билета
     */
    @Test
    public void shouldReturnSelfWhenPrepareTicket() {
        MealTicketBuilder ticketBuilder = new TicketBuilder();
        MealTicketBuilder builder = ticketBuilder.ticket(123);
        assertNotNull(builder);
    }

    /**
     * Проверяем что {@link TicketBuilder} корректно строит билет
     */
    @Test
    public void shouldBuildTicket() {
        MealTicketBuilder ticketBuilder = new TicketBuilder();
        Lucky ticket = ticketBuilder.ticket(123).build();
        assertNotNull(ticket);
    }

    @Test
    @Ignore
    public void worksSameAsTicketConstructor() {
        long ticketNumber = 9876L;
        MealTicketBuilder ticketBuilder = new TicketBuilder();
        Lucky builtTicket =  ticketBuilder.ticket(ticketNumber).build();
        //TODO: equals method for ticket
        assertEquals(new EvenLuckyImpl(ticketNumber), builtTicket);
    }

    @Test
    public void couldNotBeReused() {
        MealTicketBuilder builder = new TicketBuilder();
        builder.ticket(123).build();
        Exception exception = null;
        try {
            builder.build();
        } catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        assertEquals(IllegalStateException.class, exception.getClass());
    }

    @Test
    public void notWorkingWithoutTicket() {
        MealTicketBuilder builder = new TicketBuilder();
        Exception exception = null;
        try {
            builder.build();
        } catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        assertEquals(NullPointerException.class, exception.getClass());
    }
}