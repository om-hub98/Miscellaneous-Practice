package DataStructure.String;

import javax.xml.stream.events.Characters;

/*
     Find largest odd number from the given string
  */
public class LargestOddNumberFromString {
    public static void main(String[] args) {
        String str = largestOddNumber("40274");
        System.out.println("largest Off number from string : "+str);
    }
    public static String largestOddNumber(String num){
        for(int index=num.length()-1;index>=0;index--){
            if(Character.getNumericValue(num.charAt(index)) % 2 == 1){
                return num.substring(0,index+1);
            }
        }
        return "Not found";
    }
}
