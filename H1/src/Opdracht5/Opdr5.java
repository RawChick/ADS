package Opdracht5;

import java.util.*;

/**
 * Created by Renee on 2/6/2017.
 */
public class Opdr5 {

    public static void main(String[] args) {
        //Implementatie bucket sort int-array
        int length = 20;
        long t0 = new Date().getTime();
        int[] array = new int[length];
        Random r = new Random();

        for (int i = 0; i < length; i++)
            array[i] = r.nextInt(length - 1) + 1;

        System.out.println("Before sorting: " + Arrays.toString(array));

        System.out.println("After sorting:  " + bucketSort(array, t0).toString());
        System.out.println("Hallo");
    }


    public static List<Integer> bucketSort(int[] array, long t0) {
        int max = 0;
        int min = 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        int bucketCount = (max - min) + 1;
        List<List<Integer>> buckets = new ArrayList<List<Integer>>(bucketCount);
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < array.length; i++) {
            buckets.get((array[i] - 1)).add(array[i]);
        }

        List<Integer> sortedArray = new ArrayList<Integer>(array.length + 1);
        for (int i = 0; i < bucketCount; i++) {
            for (int j = 0; j < buckets.get(i).size(); j++) { //merge the buckets
                sortedArray.add(buckets.get(i).get(j));
            }
        }
        long t1 = new Date().getTime();
        System.out.println("Sorting this list took " + (t1 - t0) + " ms");
        return sortedArray;
    }
}
