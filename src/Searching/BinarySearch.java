package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 2;
        int left = 0, right = arr.length-1;    //left = 0               right = 9, 3
        while(left < right){                   // true,
            int mid = (left+right)/2;          // 4, 1
            if(arr[mid] == target) {
                System.out.println("Index of target : "+mid);
                break;
            }
            else if(arr[mid] > target) right=mid-1;
            else left=mid+1;
        }
    }
}
