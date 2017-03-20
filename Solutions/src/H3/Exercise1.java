package H3;

import Tools.Console;
import Tools.Exercise;
import Tools.Tools;

class Exercise1 extends Exercise {

    Exercise1() {
        super("Merge two sorted arrays");
    }

    @Override
    public void test() {

        int a[] = Tools.generateSortedArray(10, 1, 1, 10);
        int b[] = Tools.generateSortedArray(10, 1, 1, 10);

        Console.write("a[] = ");
        Tools.showNumbers(a);
        Console.write("b[] = ");
        Tools.showNumbers(b);

        int c[] = mergeSortedArrays(a, b);

        Console.write("c[] = ");
        Tools.showNumbers(c);

    }

    int[] mergeSortedArrays(int[] a, int[] b) {
        int alen = a.length;
        int blen = b.length;
        int[] c = new int[alen + blen];
        int i = 0, j = 0, k = 0;
        while (i < alen && j < blen) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < alen) {
            c[k++] = a[i++];
        }
        while (j < blen) {
            c[k++] = b[j++];

        }
        return c;
    }
}
