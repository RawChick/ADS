package H1;

import Tools.Tools;
import Tools.Console;
import Tools.Exercise;

class Exercise_3 extends Exercise {

    Exercise_3() {
        super("Binary search");
    }

    int binarySearch(int[] a, int value) {
        int start = 0;
        int end = a.length - 1;
        int mid;
        while (end >= start) {
            
            Tools.showNumbers(a, start, end);
            
            mid = (end + start) / 2;
            if (a[mid] < value) {
                start = mid + 1;
            } else if (a[mid] > value) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    @Override
    public void test() {
        int n = Console.readInt("How many numbers in array? ", 1, 60);
        int[] a = Tools.generateSortedArray(n);
        Tools.showNumbers(a);

        while (true) {
            int v = Console.readInt("Number to find? (-1 to stop) ", -10000, 10000);
            if (v == -1) {
                break;
            }
            int pos = binarySearch(a, v);
            if(pos == -1) {
                Console.writeLine("Not found");
            } else {
                Console.writeLine("Found at position " + pos);
            }
        }
    }
}
