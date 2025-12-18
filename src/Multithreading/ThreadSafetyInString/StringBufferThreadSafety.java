package Multithreading.ThreadSafetyInString;

public class StringBufferThreadSafety {
    /*
    public static void main(String[] args) {
        StringBuffer sbuff = new StringBuffer("Omraj");

        Runnable runnable = () -> {
            StringBuffer local = sbuff.append(" Pradhan");
            System.out.println(Thread.currentThread().getName()+" : "+local);
        };

        for(int i=0;i<=5;i++){
            new Thread(runnable).start();
        }
    }
    */
    public static void main(String[] args) {
        StringBuffer sbuff = new StringBuffer("A");

        Runnable runnable = () -> {
            for(int i=0; i<=1000; i++){
                sbuff.append("B");
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }catch (Exception ex){
            ex.printStackTrace();
        }

        System.out.println("Length : "+sbuff.length());

    }
}
