package Multithreading.ThreadSafetyInString;

public class StringThreadSafety {

    public static void main(String[] args) {
        String str = "Omraj";

        Runnable runnable = () -> {
            String local = str.concat(" Pradhan");
            System.out.println(Thread.currentThread().getName()+" : "+local);
        };

        for(int i=0;i<=5;i++){
            new Thread(runnable).start();
        }
    }
}
