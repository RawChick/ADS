package H5;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

class Tools {

    static final Random random = new Random();

    static String format(long n) {
        return NumberFormat.getNumberInstance(Locale.GERMAN).format(n);
    }

    static void showNumbersStarred(int[] a, int i1, int i2) {
        for (int i = 0; i < a.length; i++) {
            if (i == i1 || i == i2) {
                System.out.format("%3d*", a[i]);
            } else {
                System.out.format("%3d ", a[i]);
            }
        }
        System.out.println();
    }

    static void showNumbers(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.format("%3d ", a[i]);
        }
        System.out.println();
    }

    static void showNumbers(List a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.format("%3d ", (int) a.get(i));
        }
        System.out.println();
    }

    static void showNumbers(int[] a, int start, int end) {
        for (int i = 0; i < start; i++) {
            System.out.format("    ");
        }
        for (int i = start; i <= end; i++) {
            System.out.format("%3d ", a[i]);
        }
        System.out.println();
    }

    static int[] generateUnsortedArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(n * 3);
        }
        return a;
    }

    static int[] generateSortedArray(int n) {
        int[] a = new int[n];
        int value = random.nextInt(5);
        for (int i = 0; i < n; i++) {
            a[i] = value;
            value += random.nextInt(5);
        }
        return a;
    }

    static int[] generateSortedArray(int n, int start, int minstep, int maxstep) {

        int[] a = new int[n];
        int value = start;
        for (int i = 0; i < n; i++) {
            value += minstep + random.nextInt(maxstep - minstep);
            a[i] = value;
            value += random.nextInt(5);
        }
        return a;
    }
    static ArrayList<Integer> generateSortedArrayList(int n, int start, int minstep, int maxstep) {

        ArrayList<Integer> a = new ArrayList<>();
        int value = start;
        for (int i = 0; i < n; i++) {
            value += minstep + random.nextInt(maxstep - minstep);
            a.add(new Integer(value));
            value += random.nextInt(5);
        }
        return a;
    }
}
