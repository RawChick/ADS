package H1;

import Tools.Tools;
import Tools.Console;
import Tools.Exercise;

class Exercise_2 extends Exercise {

    Exercise_2() {
        super("Bubble sort");
    }

    void bubbleSortPlain(int[] a) {
        for (int n = a.length - 1; n >= 0; n--) {
            for (int j = 0; j < n; j++) {
                Tools.showNumbersStarred(a, j, j + 1);
                if (a[j] > a[j + 1]) {
                    int h = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = h;
                }
            }
        }
    }

    void bubbleSort(int[] a) {
        boolean swapped = true;
        for (int n = a.length - 1; n >= 0 && swapped; n--) {
            swapped = false;
            for (int j = 0; j < n; j++) {
                Tools.showNumbersStarred(a, j, j + 1);
                if (a[j] > a[j + 1]) {
                    int h = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = h;
                    swapped = true;
                }
            }
        }
    }

    @Override
    public void test() {
        int n = Console.readInt("How many numbers in array? ", 1, 20);
        int[] a = Tools.generateUnsortedArray(n);
        int[] b = Tools.copyArray(a);
        Tools.showNumbers(a);
        bubbleSortPlain(a);
    }
}
