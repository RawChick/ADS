package H2;

import static Tools.Tools.format;
import Tools.Console;
import Tools.Exercise;

class Exercise_2 extends Exercise {

    Exercise_2() {
        super("Fibonacci iterative");
    }

    @Override
    public void test() {
        int max = Console.readInt("Howmany? ", 0, 100);
        for (int i = 0; i < max; i++) {
            ftest(i);
        }
    }

    private int count;

    void ftest(int n) {
        count = 0;
        int value = fibo(n);
        Console.writeLine("fibo(" + n + ") = " + value + " [count = " + format(count) + "]");
    }

    private int fibo(int n) {
        if (n < 1) {
            return 0;
        }
        int a = 1;
        int b = 1;
        int h;
        while (n > 2) {
            count++;
            h = a;
            a = b;
            b = h + a;
            n--;
        }
        return b;
    }
}
