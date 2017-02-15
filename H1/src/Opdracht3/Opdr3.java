package Opdracht3;

/**
 * Created by Renee on 2/6/2017.
 */
public class Opdr3 {
    //implementatie binair zoekalgoritme

    public static void main(String[] args) {
    System.out.println(binarySearch(12));
    }


    public static boolean binarySearch(int key) {
        int[] data = {0,1,2,3,4,5,6,7,8,9,10,12,20,30,45,47,50,61,65,75};
        int size = data.length;

        int low = 0;
        int high = size - 1;

        while(high >= low) {

            int middle = (low + high) / 2;
            System.out.println(middle);
            if(data[middle] == key) {
                return true;
            }
            if(data[middle] < key) {
                low = middle + 1;
            }
            if(data[middle] > key) {
                high = middle - 1;
            }
        }
        return false;
    }
}
