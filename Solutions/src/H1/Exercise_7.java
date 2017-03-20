package H1;

import java.util.Arrays;
import Tools.Exercise;

class Exercise_7 extends Exercise {

    Exercise_7() {
        super("Merge Sort");
    }

    int[] mergeSort(int[] a, int[] b) {
        int[] r = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (k < r.length) {
            if (i < a.length && j < b.length) {
                if (a[i] < b[j]) {
                    r[k++] = a[i++];
                } else {
                    r[k++] = b[j++];
                }
            } else if (i < a.length) {
                r[k++] = a[i++];
            } else if (j < b.length) {
                r[k++] = b[j++];
            }       
        }
        return r;
    }

    @Override
    public void test() {
        int countA = Tools.Console.readInt("How many numbers in array a? ", 1, 100);
        int countB = Tools.Console.readInt("How many numbers in array b? ", 1, 100);
        int[] a = Tools.Tools.generateUnsortedArray(countA, 1, 100);
        Arrays.sort(a);
        int[] b = Tools.Tools.generateUnsortedArray(countB, 1, 100);
        Arrays.sort(b);
        Tools.Console.writeLine("Array a");
        Tools.Tools.showNumbers(a);
        Tools.Console.writeLine("Array b");
        Tools.Tools.showNumbers(b);
        int[] c = mergeSort(a, b);
        Tools.Console.writeLine("The result");
        Tools.Tools.showNumbers(c);
    }

}
