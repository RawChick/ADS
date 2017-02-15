package Opdracht1;

import java.util.Date;

/**
 * Created by Renee on 2/6/2017.
 */
public class d1 {
    //d = O(n^2)

    public static void main(String[] args) {
        long som = 0;
        int n = 200;
        long t0 = new Date().getTime();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                som++;
            }
        }
        long t1 = new Date().getTime();
        System.out.println(t1 - t0);
    }
}
