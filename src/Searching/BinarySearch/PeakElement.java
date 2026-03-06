package Searching.BinarySearch;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3};
        System.out.println("Peak element indes : "+searchPeakElementIndex(arr));
    }
    public static int searchPeakElementIndex(int[] nums){
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid-1] < nums[mid] && nums[mid] > nums[mid+1])
                return mid;
            else if(nums[mid] < nums[mid+1])
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}
