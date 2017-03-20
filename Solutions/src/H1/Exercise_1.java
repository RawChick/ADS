package H1;

import Tools.Tools;
import Tools.Exercise;

class Exercise_1 extends Exercise {

    Exercise_1() {
        super("Some Loops");
    }
    
    @Override
    public void test() {
        ExerciseRunner opg1;

        opg1 = new Exercise1a();
        opg1.test();
        opg1 = new Exercise1b();
        opg1.test();
        opg1 = new Exercise1c();
        opg1.test();
        opg1 = new Exercise1d();
        opg1.test();
    }
}

abstract class ExerciseRunner {

    private final String name;
    private final int maxtest;

    ExerciseRunner(String name, int maxtest) {
        this.name = name;
        this.maxtest = maxtest;
    }

    abstract long run(int n);

    void test() {
        System.out.format("%-10s                  n         loop-count       runtime (ns)%n", name);
        System.out.format("%-10s ================== ================== ==================%n", "");
        for (int n = 1; n <= maxtest; n *= 10) {
            long startTime = System.nanoTime();
            long count = run(n);
            long runTime = System.nanoTime() - startTime;
            System.out.format("%-10s %18s %18s %18s%n",
                    "",
                    Tools.format(n),
                    Tools.format(count),
                    Tools.format(runTime));
        }
        System.out.println();
    }

}

class Exercise1a extends ExerciseRunner {

    Exercise1a() {
        super("Exercise 1a", 1000000000);
    }

    @Override
    long run(int n) {
        long count = 0;
        for (int i = 0; i < n; i++) {
            count++;
        }
        return count;
    }

}

class Exercise1b extends ExerciseRunner {

    Exercise1b() {
        super("Exercise 1b", 10000);
    }

    @Override
    long run(int n) {
        long count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count++;
            }
        }
        return count;
    }
}

class Exercise1c extends ExerciseRunner {

    Exercise1c() {
        super("Exercise 1c", 1000);
    }

    @Override
    long run(int n) {
        long count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * n; j++) {
                count++;
            }
        }
        return count;
    }
}

class Exercise1d extends ExerciseRunner {

    Exercise1d() {
        super("Exercise 1d", 100000);
    }

    @Override
    long run(int n) {
        long count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                count++;
            }
        }
        return count;
    }
}

