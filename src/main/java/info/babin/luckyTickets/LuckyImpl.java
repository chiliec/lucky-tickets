package info.babin.luckyTickets;

import java.util.function.Predicate;

/**
 * Предоставляет метод определения является ли объект "счастливым"
 */
class LuckyImpl implements Lucky {
    private long numbers;

    LuckyImpl(long numbers) {
        this.numbers = numbers;
    }

    public boolean isLucky() {
        byte[] c = String.format("%06d", numbers).getBytes();
        return c[0]+c[1]+c[2]==c[3]+c[4]+c[5];
    }

    @Override
    public String toString() {
        return String.valueOf(numbers);
    }

    /**
     * Стандартный метод шаблона "Посетитель"
     *
     * @param visitor новая функциональность
     * @return результат вычислений
     */
    @Override
    public boolean accept(Predicate< HasOrdinal > visitor) {
        return visitor.test(this);
    }
}

