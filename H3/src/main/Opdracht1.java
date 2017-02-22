package main;

import java.util.Arrays;

/**
 * Created by rrsui on 18-2-2017.
 */
public class Opdracht1 {

    String opdracht = "Opdracht1";
    int[] a = {1,2,3,5,8,13,21,34,55,89};
    int[] b = {2,4,8,16,32,64,128,256,512,1024};

    public Opdracht1(){
        System.out.println("---------------" + opdracht + "----------------");
        System.out.println(Arrays.toString(merge(a, b)));
    }

    public int[] merge(int[] d, int[] e){
        int[] array1and2 = new int[d.length + e.length];
        System.arraycopy(d, 0, array1and2, 0, d.length);
        System.arraycopy(e, 0, array1and2, d.length, e.length);

        Arrays.sort(array1and2);
        return array1and2;
    }
}