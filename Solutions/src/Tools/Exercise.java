package Tools;

public abstract class Exercise {
    
    private final String title;
    
    public Exercise(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
    
    public abstract void test();

    public void runTest() {
        Console.writeLine(title);
        test();
    }
}
