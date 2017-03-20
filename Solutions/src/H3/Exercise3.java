package H3;

import java.util.ArrayList;
import Tools.Console;
import Tools.Exercise;

class Exercise3 extends Exercise {

    Exercise3() {
        super("Add polynomes");
    }
    
    @Override
    public void test() {
        Polynome a = new Polynome();
        a.addTerm(new Term(1, 3));
        a.addTerm(new Term(2, 2));
        a.addTerm(new Term(-3, 0));
        Console.write("a = ");
        a.show();

        Polynome b = new Polynome();
        b.addTerm(new Term(2, 4));
        b.addTerm(new Term(-1, 3));
        b.addTerm(new Term(2, 2));
        b.addTerm(new Term(-3, 0));
        Console.write("b = ");
        b.show();

        Polynome c = a.add(b);
        Console.write("c = ");
        c.show();
    }

}

class Term {

    private final int coefficient;
    private final int exponent;

    Term(int coefficient, int exponent) {
        this.coefficient = coefficient;
        this.exponent = exponent;
    }

    int getCoef() {
        return coefficient;
    }

    int getExp() {
        return exponent;
    }
}

class Polynome {

    private final ArrayList<Term> terms;

    Polynome() {
        terms = new ArrayList<>();
    }

    void addTerm(Term term) {
        int n = terms.size();
        if (n > 0 && terms.get(n - 1).getExp() < term.getExp()) {
            System.err.println("wrong order...");
        } else {
            terms.add(term);
        }
    }

    void show() {

        for (Term term : terms) {
            if (term.getCoef() >= 0) {
                Console.write("+");
            }
            Console.write(term.getCoef() + "X^" + term.getExp() + "  ");
        }
        Console.writeLine();

    }

    Polynome add(Polynome that) {
        Polynome result = new Polynome();
        int thisSize = this.terms.size();
        int thatSize = that.terms.size();
        int i = 0, j = 0;
        while (i < thisSize && j < thatSize) {
            Term a = this.terms.get(i);
            Term b = that.terms.get(j);
            if (a.getExp() > b.getExp()) {
                result.addTerm(a);
                i++;
            } else if (b.getExp() > a.getExp()) {
                result.addTerm(b);
                j++;
            } else { // equal
                int coef = a.getCoef() + b.getCoef();
                if (coef != 0) {
                    Term combi = new Term(coef, a.getExp());
                    result.addTerm(combi);
                }
                i++;
                j++;
            }

        }
        while (i < thisSize) {
            result.addTerm(this.terms.get(i++));
        }
        while (j < thatSize) {
            result.addTerm(that.terms.get(j++));
        }
        return result;
    }

}
