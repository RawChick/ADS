package Opdracht7;

import java.util.Arrays;

/**
 * Created by Renee on 2/6/2017.
 */
public class Opdr7 {
    //2 gesorteerde arrays samenvoegen

    public static void main(String[] args) {

        int[] a = {0, 4, 6, 8, 10, 11, 14, 18, 32};
        int[] b = {2, 5, 7, 13, 15, 21, 25, 31, 42};

        System.out.println("List a: " + Arrays.toString(a));
        System.out.println("List b: " + Arrays.toString(b));
        System.out.println("Merged list: " + Arrays.toString(voegSamen(a, b)));

    }

    private static int[] voegSamen(int[] a, int[]  b){

        int[] c = new int[(a.length + b.length)];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                k++;
                i++;
            } else {
                c[k] = b[j];
                k++;
                j++;
            }
        }

        while(i < a.length){
            c[k] = a[i];
            i++;
            k++;
        }

        while(j < b.length){
            c[k] = b[j];
            k++;
            j++;
        }


        return c;
    }

}
