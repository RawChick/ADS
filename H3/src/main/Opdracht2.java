package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by rrsui on 18-2-2017.
 */
public class Opdracht2 {
    ArrayList<Integer> a;
    ArrayList<Integer> b;
    ArrayList<Integer> c;
    String opdracht = "Opdracht 2";

    public Opdracht2(){
        System.out.println("---------------" + opdracht + "----------------");
        a = new ArrayList();
        b = new ArrayList();
        c = new ArrayList();

        a.addAll(Arrays.asList(1,2,3,5,8,13,21,34,55,89));
        b.addAll(Arrays.asList(2,4,8,16,32,64,128,256,512,1024));
        c.addAll(a);
        c.addAll(b);

        Collections.sort(c);
        for (Integer p : c){
            System.out.print(p + ", ");
        }
    }
}