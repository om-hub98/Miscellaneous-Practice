package Sorting.AdvanceSorting;

import java.util.Arrays;

public class SortingStringArray {
    public static void main(String[] args) {
        String[] str={"Arjun","Bazir","Tiger","Sonam","Omraj"};
        Arrays.sort(str,(a, b)->a.compareToIgnoreCase(b));
        for(String s:str){
            System.out.println(s);
        }
    }
}
