package Searching;

import java.util.Arrays;
import java.util.List;

public class IndexFromRotatedSortedArray {
    public static void main(String[] args) {
        List<List<Integer>> listOfArrays = Arrays.asList(
                Arrays.asList(2,5,6,0,0,1,2),
                Arrays.asList(1,0,1,1,1)
        );
        int[] nums = null;
        int target = 3;
        for (List<Integer> arr : listOfArrays) {
            nums = arr.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();

            System.out.println("Index of element : " + search(nums, target));
        }
    }

    /*
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while(left < right){
            int mid = (left+right)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target && nums[left] <= target) right = mid-1;
            else left = mid+1;
        }
        return -1;
    }*/
        public static boolean search(int[] nums, int target) {
            int left = 0, right = nums.length - 1;

            while (left <= right) {
                // this reduce integer overflow ar integer max value is  2,147,483,647
                int mid = left + (right - left)/2;

                if (nums[mid] == target)
                    return true;

                //handle duplicates
                if(nums[left] == nums[mid] && nums[mid] == nums[right]){
                    left++;
                    right--;
                }

                // Left half is sorted
                else if (nums[left] <= nums[mid]) {
                    if (nums[left] <= target && target < nums[mid])
                        right = mid - 1;
                    else
                        left = mid + 1;
                }
                // Right half is sorted
                else {
                    if (nums[mid] < target && target <= nums[right])
                        left = mid + 1;
                    else
                        right = mid - 1;
                }
            }

            return false;
        }
}


