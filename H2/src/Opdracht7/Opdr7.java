package Opdracht7;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Renee on 2/12/2017.
 */
public class Opdr7 {
    //recursieve methode voor Torens vsn Hanoi

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<Integer> B = new ArrayList<Integer>();
        ArrayList<Integer> C = new ArrayList<Integer>();

        A.add(7);
        A.add(5);
        A.add(3);
        A.add(1);
        int size = A.size();

        System.out.println("Before solving:");
        System.out.println("A: " + A.toString());
        System.out.println("B: " + B.toString());
        System.out.println("C: " + C.toString());
        System.out.println();

        Hanoi(size,"A", "B", "C", A, B, C);
        System.out.println( );
        System.out.println("After solving:");
        System.out.println("A: " + A.toString());
        System.out.println("B: " + B.toString());
        System.out.println("C: " + C.toString());
    }



        private static void Hanoi(int size, String begin, String middle, String end, ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C){
        if(size == 1){
            C.add(A.get(A.size() - 1));
            A.remove(A.size() - 1);
            System.out.println(begin + "->" + end);
        } else {
            B.add(A.get(A.size() - 1));
            A.remove(A.size() - 1);
            Hanoi(size - 1, begin, end, middle, A, C, B);
            System.out.println(begin + "->" + end);
            C.add(B.get(B.size() - 1));
            B.remove(B.size() - 1);
            Hanoi(size - 1, middle, begin, end, B, A, C);
        }
    }
}
