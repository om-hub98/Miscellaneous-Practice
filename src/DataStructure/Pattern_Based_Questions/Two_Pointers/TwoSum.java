package DataStructure.Pattern_Based_Questions.Two_Pointers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 19;
        //int[] result = twoSumMethod(arr, target);
        int[] result = twoSumMethodOptimized(arr, target);
        for(int n : result){
            System.out.print(n+", ");
        }

    }
    // Time Complexity -> O(n^2)
    public static int[] twoSumMethod(int[] arr, int target){
       // int[] newArray =
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; i<arr.length; i++){
                int sum = arr[i]+arr[j];

                if(sum == target) return new int[]{arr[i], arr[j]};
            }
        }
        return new int[]{};
    }
    // Time Complexity -> O(n)
    public static int[] twoSumMethodOptimized(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<arr.length-1; i++){
           if(map.containsKey(arr[i])) return new int[]{arr[i], map.get(arr[i])};
           map.put(target-arr[i], arr[i]);
        }
        return new int[]{};
    }
}
