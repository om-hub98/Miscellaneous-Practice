package Sorting.MergeSort;

public class MergeSorting {
    public static void main(String[] args) {
        int[] arr = {8,7,3,4,9,1,6,4,2};

        mergeSort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    private static void mergeSort(int[] arr) {
        int len=arr.length;
        if(len<=1) return;

        int mid=len/2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[len - mid];

        int i=0, j=0;

        // split and create left array and right array
        for(; i<len;i++){
            if(i<mid){
                leftArr[i] = arr[i];
            }else{
                rightArr[j++] = arr[i];
            }
        }
        // recursive call till all the arrays are not splited
        mergeSort(leftArr);
        mergeSort(rightArr);
        mergeAll(arr,leftArr,rightArr);
    }

    private static void mergeAll(int[] arr, int[] leftArr, int[] rightArr) {
        int leftLen = leftArr.length;
        int rightLen = rightArr.length;

        int l=0, r=0, k=0;
        while(l < leftLen && r < rightLen){
            if(leftArr[l] < rightArr[r]){
                arr[k++] = leftArr[l++];
            }else{
                arr[k++] = rightArr[r++];
            }
        }
        // copy remaining elements from left
        while (l < leftLen) {
            arr[k++] = leftArr[l++];
        }

        // copy remaining elements from right
        while (r < rightLen) {
            arr[k++] = rightArr[r++];
        }
    }
}
