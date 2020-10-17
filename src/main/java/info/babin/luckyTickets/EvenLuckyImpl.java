package info.babin.luckyTickets;

public class EvenLuckyImpl implements Lucky {
    private long numbers;

    public EvenLuckyImpl(long numbers) {
        if (numbers < 0) {
            throw new IllegalArgumentException("Попытка создать билет с отрицательным номером!");
        }
        if (numbers >= 10000) {
            throw new IllegalArgumentException("Попытка создать билет со слишком большим номером!");
        }
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
