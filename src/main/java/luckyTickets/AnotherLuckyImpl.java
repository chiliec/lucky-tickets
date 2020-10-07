package luckyTickets;

public class AnotherLuckyImpl implements Lucky {
    private long numbers;

    AnotherLuckyImpl(long numbers) {
        this.numbers = numbers;
    }

    public boolean isLucky() {
        byte[] c = String.format("%04d", numbers).getBytes();
        return c[0]+c[1]==c[2]+c[3];
    }

    @Override
    public String toString() {
        return String.valueOf(numbers);
    }
}
