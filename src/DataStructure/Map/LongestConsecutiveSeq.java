package DataStructure.Map;

import java.util.*;

public class LongestConsecutiveSeq {
    public static void main(String[] args) {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};

        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        List<Integer> list = new ArrayList<>(set);
        //System.out.println("List : "+list);

        int count = 1;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) != list.get(i)) count++;

            //System.out.println("Inside :"+count);
        }
        System.out.println(count);
    }
}
