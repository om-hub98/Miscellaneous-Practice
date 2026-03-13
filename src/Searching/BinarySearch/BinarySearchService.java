package Searching.BinarySearch;

public class BinarySearchService {


    public int binarySearchTargetFromPivotSorted(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while(left < right){
            int mid = (left+right)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target && nums[left] <= target) right = mid-1;
            else left = mid+1;
        }
        return -1;
    }

    public int binarySearchMinimumElementFromPivotSorted(int[] nums) {
        int left = 0, right = nums.length-1;
        while(left < right){
            int mid = (left+right)/2;
            if(nums[mid] > nums[right])
                left = mid+1;
            else
                right = mid-1;
        }
        return nums[left];
    }

    public boolean binarySearchTargetElementExistence(int[] nums, int target) {
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


