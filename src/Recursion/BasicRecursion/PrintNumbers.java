package Recursion.BasicRecursion;

public class PrintNumbers {
    static int count=1;
    public static void func(){
        if(count==5)return;
        print(count);
        count++;
        func();
    }
    public static void print(int c){
        System.out.println("Count :"+c);
    }
    public static void main(String[] args) {
        func();
    }
}
