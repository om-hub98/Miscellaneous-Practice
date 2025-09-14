package ExceptionHandling.UnChecked;

public class MethodLevelException {

    public static void main(String[] args) {
        System.out.println("Main method");
        try{
            method1();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("After exception");
        System.out.println("After exception 1");
        System.out.println("After exception 2");
    }
    public static void method1() throws ArithmeticException{
        method2();
    }
    public static void method2() throws ArithmeticException{
        System.out.println(5/0);


    }
}
