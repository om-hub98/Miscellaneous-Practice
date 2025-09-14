package Recursion.BasicRecursion;

public class SumOfFirstNNaturalNo {
    static int count=1;
    static int sum=0;
    public static void func(int n){
        if(count==5)return;
        sum(n);
        count++;
        func(n--);
    }
    public static void sum(int c){
        sum+=c;
    }
    public static void main(String[] args) {
        func(5);
    }
}

