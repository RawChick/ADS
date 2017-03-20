package H2;

import Tools.Console;

abstract class Exercise {
    abstract void test();

    abstract String getTitle();
    
    void runTest() {
        Console.writeLine(getTitle());
        test();
    }
}
