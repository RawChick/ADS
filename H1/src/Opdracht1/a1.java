package Opdracht1;

import java.util.Date;

/**
 * Created by Renee on 2/11/2017.
 */
public class a1 {

    // a = O(n)

    public static void main(String[] args) {
        long som = 0;
        int n = 20;
        long t0 = new Date().getTime();

        for (int i = 0; i < n; i++){
            som++;
        }
        long t1 = new Date().getTime();
        System.out.println(t1-t0);
    }
}


