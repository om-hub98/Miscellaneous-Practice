package DataStructure.String;

import java.util.Arrays;

public class SortArrayOfString {
    public static void main(String[] args) {
        String[] words = {"cd","ef","ab"};

        Arrays.sort(words);
        System.out.print("[");
        for(String s : words) System.out.print(s+",");
        System.out.println("]");
    }
}
