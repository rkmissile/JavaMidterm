package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String a="army";
        String b="mary";

        checkAnangram(a,b);

    }

    public static void checkAnangram(String a, String b){
        char[] arrayA= a.toCharArray();
        char[] arrayB= b.toCharArray();

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        boolean anangram = Arrays.equals(arrayA,arrayB);

        if(anangram) {
            System.out.println("given strings are anangram");
        }else{
            System.out.println("given strings aren't annagram");
        }
    }
}
