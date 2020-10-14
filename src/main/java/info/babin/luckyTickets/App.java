package info.babin.luckyTickets;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Integer ticketLength = context.getBean("ticketLength", Integer.class);
        System.out.println("Число цифр в билете: " + ticketLength);
        Supplier<Long> counter = context.getBean("evenTicketCounter", Supplier.class);
        System.out.println("Счастливых билетов " + counter.get());
    }
}


