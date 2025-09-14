package Sorting.AdvanceSorting;

import java.util.Arrays;

public class SortIntegerArray {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        Arrays.sort(intervals,(a, b)-> Integer.compare(a[0],b[0]));
        for(int[] arr: intervals){
            System.out.println("["+arr[0]+", "+arr[1]+"]");
        }
    }
}
