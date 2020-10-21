package info.babin.luckyTickets;

import java.util.function.Predicate;

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

    /**
     * @return подрядковый номер
     */
    @Override
    public Long getOrdinal() {
        return numbers;
    }

    @Override
    public String toString() {
        return String.valueOf(numbers);
    }

    /**
     * Стандартный метод шаблона "Посетитель"
     *
     * @param visitor новая функциональность
     * @return результат вычислений, выполненных над экземпляром, для которого вызвали метод
     */
    @Override
    public boolean accept(Predicate< HasOrdinal > visitor) {
        return visitor.test(this);
    }
}
