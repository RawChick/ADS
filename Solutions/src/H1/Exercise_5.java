package H1;

import Tools.Tools;
import Tools.Console;
import Tools.Exercise;

class Exercise_5 extends Exercise {

    Exercise_5() {
        super("Bucket sort");
    }

    void bucketSort(int[] a) {

        if (a.length <= 1) {
            return;
        }

        // find lowest and highest value in array
        int min = a[0];
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            } else if (a[i] > max) {
                max = a[i];
            }
        }

        // create enough bucket space
        int[] bucket = new int[max - min + 1];
        // luckily Java initilizes them all to 0

        // fill the buckets
        for (int i = 0; i < a.length; i++) {
            bucket[a[i] - min]++;
        }

        // show the buckets to the public
        Tools.showNumbersIndexed(bucket);
        
        // empty the buckets back in the array
        int k = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                a[k++] = i + min;
            }
        }
    }

    @Override
    public void test() {
        int n = Console.readInt("How many numbers in array? ", 1, 100);
        int lo = Console.readInt("Lowest number? ", -1000, 1000);
        int hi = Console.readInt("Highest number? ", -1000, 1000);
        int[] a = Tools.generateUnsortedArray(n, lo, hi);
        Console.writeLine("The input");
        Tools.showNumbers(a);
        Console.writeLine("The buckets");
        bucketSort(a);
        Console.writeLine("The output");
        Tools.showNumbers(a);
    }
}
