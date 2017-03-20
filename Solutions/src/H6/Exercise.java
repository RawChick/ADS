
package H6;

abstract class Exercise {
    abstract void test();

    abstract String getTitle();
    
    void runTest() {
        Console.writeLine(getTitle());
        test();
    }
}
