package Recursion.BasicRecursion;

import java.time.LocalDateTime;

public class ReverseAGivenString {
    public static void main(String[] args) {
        String str="Hello beautiful world";
        System.out.println("Before process begins : "+System.currentTimeMillis());
        String result = reverseString(str);
        System.out.println("Reverse String : "+result);
        System.out.println("After process ends : "+System.currentTimeMillis());
    }

    private static String reverseString(String str) {
        //base case
        if(str.isEmpty())
            return "";
        return reverseString(str.substring(1))+str.charAt(0);
    }
}
