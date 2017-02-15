package Opdracht4;

/**
 * Created by Renee on 2/12/2017.
 */
public class Opdr4_NietRecursief {
    //niet-recursieve methode fibonacci

    public static void main(String[] args) {
        fibo();
    }

    private static void fibo() {
        int n = 1;
        int o = 0;
        int p = 0;

        int diepte = 15;
        for (int i = 0; i < diepte; i++) {
                System.out.println(n);
                p = o + n;
                o = n;
                n = p;
        }
    }
}