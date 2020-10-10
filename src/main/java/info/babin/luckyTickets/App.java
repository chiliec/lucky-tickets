package info.babin.luckyTickets;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Iterator;
import java.util.function.Predicate;

public class App {
    private static Iterator<Lucky> iterator = new AnotherLuckyIterator();

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("info.babin.luckyTickets");
        Integer ticketLength = context.getBean("ticketLength", Integer.class);
        System.out.println("Ticket length: " + ticketLength);

        long counter = 0L;
        Predicate<Lucky> predicate = lucky -> lucky.isLucky();
        while (iterator.hasNext()) {
            Lucky next = iterator.next();
            if (predicate.test(next)) {
                counter++;
                System.out.println(next);
            }
        }
        System.out.println("All lucky tickets count is " + counter);
    }
}


