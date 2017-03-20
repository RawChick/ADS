package H6;

import java.util.ArrayList;
import java.util.ListIterator;

public class Week6 {

    private final Exercise[] exercises = {
        new Exercise1(),
        //new Exercise2(),
        //new Exercise3()
    };

    private void list() {
        for (int i = 0; i < exercises.length; i++) {
            Console.writeLine((i + 1) + ": " + exercises[i].getTitle());
        }
    }
    Week6() {
        int choice;
        do {
            list();
            choice = Console.readInt("What? (0 for help, -1 to quit) ", -1, exercises.length);
            if (choice == 0) {
                list();
            } else if (choice > 0 && choice <= exercises.length) {
                exercises[choice - 1].runTest();
            }
        } while (choice != -1);
    }
}

class TestRunner {

    void runTest1() {
        Console.writeLine("Test 1");

        TestClass1 a = new TestClass1();
        a.setX(3);
        TestClass1 b = a;

        Console.writeLine("before:");
        Console.writeLine("a: " + a.getX());
        Console.writeLine("b: " + b.getX());

        a.setX(5);

        Console.writeLine("after:");
        Console.writeLine("a: " + a.getX());
        Console.writeLine("b: " + b.getX());

        Console.writeLine();

    }

    void runTest2() {
        Console.writeLine("Test 2");
        TestClass2 test = new TestClass2();
    }

    void runTest3() {
        Console.writeLine("Test 3");
        TestClass3 test = new TestClass3();
    }

    void runTest4() {
        Console.writeLine("Test 4");
        TestClass4 test = new TestClass4();
    }

    void runTest5() {
        Console.writeLine("Test 5");
        TestClass4 test = new TestClass4();
    }
}

class TestClass1 {

    private int x;

    void setX(int x) {
        this.x = x;
    }

    int getX() {
        return x;
    }
}

class TestClass2 {

    int[] alist;

    TestClass2() {
        alist = new int[4];
        alist[0] = 1;
        alist[1] = 2;
        alist[2] = 4;
        alist[3] = 7;

        Tools.showNumbers(alist);
        for (int value : alist) {
            value++;
        }
        Tools.showNumbers(alist);

        for (int i = 0; i < alist.length; i++) {
            alist[i]++;
        }
        Tools.showNumbers(alist);
    }
}

class TestClass3 {

    ArrayList<Integer> alist;

    TestClass3() {
        alist = new ArrayList<>();
        alist.add(1);
        alist.add(2);
        alist.add(4);
        alist.add(7);

        Tools.showNumbers(alist);

        for (Integer value : alist) {
            value++;
        }

        Tools.showNumbers(alist);
    }
}

class TestClass4 {

    ArrayList<Integer> alist;

    TestClass4() {
        alist = new ArrayList<>();
        alist.add(1);
        alist.add(2);
        alist.add(4);
        alist.add(7);

        Tools.showNumbers(alist);

        for (int i = 0; i < alist.size(); i++) {
            int value = alist.get(i);
            alist.set(i, value + 1);
        }
        Tools.showNumbers(alist);
    }
}

class TestClass5 {

    ArrayList<Integer> alist;

    TestClass5() {
        alist = new ArrayList<>();
        alist.add(1);
        alist.add(2);
        alist.add(4);
        alist.add(7);

        Tools.showNumbers(alist);

        for (ListIterator<Integer> it = alist.listIterator(); it.hasNext();) {
            int value = it.next();
            it.set(value + 1);
        }

        Tools.showNumbers(alist);
    }
}
