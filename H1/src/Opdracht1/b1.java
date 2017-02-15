package Opdracht1;

import java.util.Date;

/**
 * Created by Renee on 2/11/2017.
 */
public class b1 {
    //b = O(n^2)

    public static void main(String[] args) {
        long som = 0;
        int n = 20;
        long t0 = new Date().getTime();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                som++;
            }
        }
        long t1 = new Date().getTime();
        System.out.println(t1 - t0);
    }
}
