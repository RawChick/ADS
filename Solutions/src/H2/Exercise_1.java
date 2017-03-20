package H2;

import static Tools.Tools.format;
import Tools.Console;
import Tools.Exercise;

class Exercise_1 extends Exercise {

    Exercise_1 () {
        super("Fibonacci recursive");
    }

    @Override
    public void test() {
        int max = Console.readInt("Howmany? ", 0, 100);
        for (int i = 0; i < max; i++) {
            ftest(i);
        }
    }

    private long count;

    void ftest(int n) {
        count = 0;
        long value = fibo(n);
        Console.writeLine("fibo(" + n + ") = " + value + " [count = " + format(count) + "]");
    }

    private long fibo(long n) {
        count++; // for measuring purpose only
        return n <= 1 ? n : fibo(n - 1) + fibo(n - 2);
    }
}
