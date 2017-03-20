package H2;

import Tools.Console;
import Tools.Exercise;

class Exercise_3 extends Exercise {

    Exercise_3 () {
        super("Palindrome");
    }

    @Override
    public void test() {
        Console.write("Text: ");
        String line = Console.readLine();
        boolean isPali = isPalindrome(sanitize(line));
        Console.writeLine("\"" + line + "\" is " + (isPali ? "" : "not ") + " a palindrome");
    }

    /**
     * Check a text for palindromity recusively
     * 
     * @param text
     * @return true if text is a palindrome
     */
    private boolean isPalindrome(String text) {
        Console.writeLine(text);

        int n = text.length(); 
        return n <= 1 || text.charAt(0) == text.charAt(n - 1) && isPalindrome(text.substring(1, n - 1));
    }

    /**
     * Sanitize a text for comparing
     * A man, a plan, a canal, Panama! -> amanaplanacanalpanama
     * 
     * @param text
     * @return text containging only letters to lowercase and digits, the rest removed
     */
    private String sanitize(String text) {

        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if(Character.isLetter(c) || Character.isDigit(c)) {
                result.append(Character.toLowerCase(c));
            }
        }
        return result.toString();
    }

}
