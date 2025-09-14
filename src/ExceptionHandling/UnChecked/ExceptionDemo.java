package ExceptionHandling.UnChecked;

public class ExceptionDemo {

    public static void main(String[] args) {
        int[] num= {4,6,7,9,6};
        int[] den = { 1,2,0,3,4};
        for(int i=0;i<num.length;i++){
            System.out.println(divide(num[i],den[i]));
        }
    }
    public static int divide(int n, int d){
        try{
            return n/d;
        } catch (Exception e) {
            System.out.println("Exception for "+n+"/"+d+" : "+e);
            return -1;
        }
    }
}
