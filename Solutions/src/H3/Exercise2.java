package H3;

import java.util.ArrayList;
import Tools.Console;
import Tools.Exercise;
import Tools.Tools;

class Exercise2 extends Exercise {

    Exercise2() {
        super("Merge two sorted ArrayLists");
    }
    
    @Override
    public void test() {

        ArrayList<Integer> a = Tools.generateSortedArrayList(9, 1, 1, 10);
        ArrayList<Integer> b = Tools.generateSortedArrayList(11, 1, 1, 10);

        Console.write("a = ");
        Tools.showNumbers(a);
        Console.write("b = ");
        Tools.showNumbers(b);

        ArrayList<Integer> c = mergeSortedArrayLists(a, b);

        Console.write("c = ");
        Tools.showNumbers(c);

    }

    ArrayList<Integer> mergeSortedArrayLists(ArrayList<Integer> a, ArrayList<Integer> b) {
        int alen = a.size();
        int blen = b.size();
        ArrayList<Integer> c = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        while (i < alen && j < blen) {
            if (a.get(i) < b.get(j)) {
                c.add(a.get(i++));
            } else {
                c.add(b.get(j++));
            }
        }
        while (i < alen) {
            c.add(a.get(i++));
        }
        while (j < blen) {
            c.add(b.get(j++));

        }
        return c;
    }
}
