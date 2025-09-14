package InterviewQuestionScenarioBased.PracticeSImpleQuestion;

import java.util.*;

public class SortAndReplaceArrayWithNewNumber {
    public static void main(String[] args) {
        int[] input = {40,10,20,30,5,3,7,45,900,46,87,36,12,19,98,874,321};
        //int[] output = sortArray(input);
        int[] output = optimizeSolution(input);
        System.out.print(" Sorted array : ");
        for(int i=0;i<output.length;i++){
            System.out.print(output[i] +" ");
        }
    }
    public static int[] optimizeSolution(int[] arr){
        int len = arr.length;

        Map<Integer,Integer> rankMap = new TreeMap<>();
        for(int num : arr){
            rankMap.put(num,0);
        }
        int rank=1;
        for(int key : rankMap.keySet()){
            rankMap.put(key,rank++);
        }
        int[] result=new int[len];
        for(int i=0;i<len;i++){
            result[i]=rankMap.get(arr[i]);
        }
        return result;
    }
    public static int[] sortArray(int[] array){
        int len=array.length;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<len;i++){
            list.add(array[i]);
        }
        int[] newArr=new int[len];
        int[] result=new int[len];
        int num=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<len;i++){
            newArr[i]=array[i];
        }
        Arrays.sort(newArr);
        for(int n : newArr){
            if(!map.containsKey(n)){
                map.put(n,++num);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key=entry.getKey();
             int index=list.indexOf(key);
             result[index]=entry.getValue();
        }
        return result;
    }

}
