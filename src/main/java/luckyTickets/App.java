package luckyTickets;

import java.util.Iterator;

public class App {
    private static Iterator<Lucky> iterator = new LuckyIterator();

    public static void main(String[] args) {
        long counter = 0L;
        while (iterator.hasNext()) {
            Lucky next = iterator.next();
            if (next.isLucky()) {
                counter++;
                System.out.println(next);
            }
        }
        System.out.println("All lucky tickets count is " + counter);
    }
}


