package Opdracht6;

/**
 * Created by Renee on 2/12/2017.
 */
public class Opdr6 {
    //recursieve implementatie binair zoek algoritme

    public static void main(String[] args) {

        int key = 51;
        int[] data = {0,1,2,3,4,5,6,7,8,9,10,12,20,30,45,47,50,61,65,75};
        int size = data.length;

        int low = 0;
        int high = size - 1;

        System.out.println(binarySearch(key, data, high, low));
    }
    public static boolean binarySearch( int key, int[] data, int high, int low) {

        if(high < low){
            return false;
        }

        int middle = (low + high) / 2;
        System.out.println(data[middle]);

        if(data[middle] == key) {
            System.out.println("Found it!");
            return true;
        } else {

            if (data[middle] < key) {
                low = middle + 1;
            }
            if (data[middle] > key) {
                high = middle - 1;
            }
            binarySearch(key, data, high, low);
        }
        return false;

    }
}
