package Multithreading.ThreadSafetyInString;

public class StringBuilderThreadSafety {
    /*
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Omraj");
        Runnable runnable = () -> {
            StringBuilder local = sb.append(" Pradhan");
            System.out.println(Thread.currentThread().getName()+" : "+local);
        };
        for(int  i=0;i<=5;i++){
            new Thread(runnable).start();
        }
    }
    */
    public static void main(String[] args) {
        StringBuilder sbuff = new StringBuilder("A");

        Runnable runnable = () -> {
            for(int i=0; i<=1000; i++){
                sbuff.append("B");
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();


        // This line of code "join()" tell main thread to wait for the running thread to complete
        try{
            thread1.join();
            thread2.join();
        }catch (Exception ex){
            ex.printStackTrace();
        }

        System.out.println("Length : "+sbuff.length());

    }
}
