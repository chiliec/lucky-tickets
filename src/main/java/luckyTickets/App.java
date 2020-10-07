package luckyTickets;

public class App {
    public static void main(String[] args) {
        for (int i = 0; i <= 999999; i++) {
            if (isLuckyTicket(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isLuckyTicket(int ticketNumbers) {
        byte[] c = String.format("%06d", ticketNumbers).getBytes();
        return c[0]+c[1]+c[2]==c[3]+c[4]+c[5];
    }
}
