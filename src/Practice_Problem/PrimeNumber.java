package Practice_Problem;

import java.util.Scanner;

/**
 * @author omraj
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        int start=2;
        int count=0;
//        while(start < num){
//            if(num % start == 0) {
//                count+=1;
//            }
//            start+=1;
//        }
//        if(count==0)
//            System.out.println(num+" is prime number");
//        else
//            System.out.println("Not a prime number");

        //optimized code
        while(start * start < num){
            if(num % start == 0) {
                count+=1;
            }
            start+=1;
        }
        if(count==0)
            System.out.println(num+" is prime number");
        else
            System.out.println("Not a prime number");
    }
}
