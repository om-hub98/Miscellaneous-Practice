package Searching.BinarySearch;

public class BinarySearchMain {
    public static void main(String[] args) {
//        List<List<Integer>> listOfArrays = Arrays.asList(
//                Arrays.asList(2,5,6,0,0,1,2),
//                Arrays.asList(1,0,1,1,1)
//        );
        int[][] testCases = {
                {100, 105, 110, 90, 95},
                {3, 4, 5, 6, 7, 8, 9, 10, 1, 2},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {0,5, 4, 3, 2, 1},
                {0}
        };

        BinarySearchService binarySearchService = new BinarySearchService();

        for(int[] nums : testCases){
            System.out.println("Result : "+binarySearchService.binarySearchMinimumElementFromPivotSorted(nums));
        }

        // int[] nums = null;
//        int target = 3;
//        for (List<Integer> arr : listOfArrays) {
//            nums = arr.stream()
//                    .mapToInt(Integer::intValue)
//                    .toArray();
//
//            System.out.println("Index of element : " + search(nums, target));
//        }
    }

}
