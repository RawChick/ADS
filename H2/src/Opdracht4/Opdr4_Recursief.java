package Opdracht4;

/**
 * Created by Renee on 2/12/2017.
 */
public class Opdr4_Recursief {
    //recursieve methode fibonacci

    public static void main(String[] args) {
        int diepte = 10;
        for(int i = 0; i < diepte; i++){
            System.out.println(fibo(i));
        }
    }

    private static int fibo (int n){
        if(n <= 1){
          return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

}
