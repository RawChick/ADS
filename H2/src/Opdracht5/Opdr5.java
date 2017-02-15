package Opdracht5;

import static jdk.nashorn.internal.objects.NativeString.substr;

/**
 * Created by Renee on 2/12/2017.
 */
public class Opdr5 {
    //Recursieve methode die aangeeft of een string een palindroom is (ABBA)

    public static void main(String[] args){

        String word = "Meetsysteem";

        word = word.toLowerCase();
        String newWord = isPalindroom(word, 1, "");
        System.out.println("Voor omdraaien: " + word);
        System.out.println("Na omdraaien:   " + newWord);
        System.out.println();

        if(newWord.equals(word)){
            System.out.println(word + " is wel een palindroom.");
        } else {
            System.out.println(word + " is geen palindroom.");
        }
    }

    private static String isPalindroom(String word, int n, String newWord){
        if(newWord.length() == word.length()) {
            return newWord;
        }
            newWord = newWord + substr(word, -n, 1);
            n++;
        return isPalindroom(word, n , newWord);
    }

}
