package H5;

import java.util.Stack;

class Exercise3 extends Exercise {

    @Override
    String getTitle() {
        return "Deep copy?";
    }

    @Override
    void test() {
        Country nl = new Country("Nederland", 10);
//        Human henk = new Human("Henk", nl, new LocalDate(2001, 4, 23));

//        Console.writeLine(henk.describe());
    }

    int priority(char ch) {
        if (ch == '^') {
            return 3;
        }
        if (ch == '/' || ch == '*') {
            return 2;
        }
        if (ch == '+' || ch == '-') {
            return 1;
        }
        return 0;
    }

    public String toPostfix(String infix) {
        Stack<Character> s = new Stack<>();
        s.push('(');
        int i, len = infix.length();
        char c;
        String r = "";
        for (i = 0; i < len; i++) {
            c = infix.charAt(i);
            if (Character.isLetter(c)) {
                r += c;
            } else if (c == '(') {
                s.push(c);
            } else if (c == ')') {
                while (s.size() > 0 && s.peek() != '(') {
                    r += s.pop();
                }
                s.pop();
            } else {
                while (priority(c) <= priority(s.peek())) {
                    r += s.pop();
                }
                s.push(c);
            }
        }
        return r;

    }
}
