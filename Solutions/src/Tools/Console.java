package Tools;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Console {

    private static final BufferedReader BUF = new BufferedReader(new InputStreamReader(System.in));

    public static String readLine() {
        try {
            return BUF.readLine();
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
            return "";
        }
    }

    public static int readInt(String prompt, int min, int max) {
        int errorCount = 0;
        while (errorCount < 3) {
            write(prompt);
            String input = readLine();
            if(input.equals("q")) {
                break;
            }
            if(input.equals("h")) {
                return 0;
            }
            try {
                int value = Integer.parseInt(input);
                if(value >= min && value <= max) {
                    return value;
                }
                System.err.println("We need something between " + min + " and " + max);
                errorCount++;
            } catch (Exception e) {
                System.err.println("Error " + e.getMessage());
                errorCount++;
            }
        }
        System.err.println("We give up");
        System.exit(0);
        return -1;
    }

    public static void write(String s) {
        System.out.print(s);
    }

    public static void writeLine() {
        System.out.println();
    }
    
    public static void writeLine(String s) {
        System.out.println(s);
    }

}
