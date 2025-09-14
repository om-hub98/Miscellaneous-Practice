package CallByValueOrRef;

public class CallByRefAndValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int x=10;
        System.out.println("Original Array :");
        for(int i:arr)
            System.out.print(i+", ");
        System.out.println();
        modify(arr);      // Call by reference => original data is modified 
        mofifyByValue(x);   // call by value => original data is not modified it remains same

        System.out.println("After modification Original Array :");
        for(int i:arr)
            System.out.print(i+", ");
        System.out.println();

        System.out.println("After modification Original Value :" +x);

    }

    private static void mofifyByValue(int x) {
        x=50;
        System.out.println("After modifying value : "+x);
    }

    public static void modify(int[] result){
        result[1]=10;
        System.out.println("After modify :");
        for(int i:result)
            System.out.print(i+", ");
        System.out.println();
    }
}
