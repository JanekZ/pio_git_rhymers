package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int ERR_INT = -1;

    private static final int NUMBERS_ARRAY_SIZE = 12;

    private int[] numbers = new int[NUMBERS_ARRAY_SIZE];

    public int total = ERR_INT;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == ERR_INT;
    }

    public boolean isFull() {
        return total == NUMBERS_ARRAY_SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERR_INT;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERR_INT;
        return numbers[total--];
    }

}
