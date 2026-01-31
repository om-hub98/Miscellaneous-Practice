package CronJob.Example1;

import java.util.Timer;

public class Demo1 {
    public static void main(String[] args) {

        System.out.println("Before cron job runs");

        Timer t = new Timer();
        MyTask myTask = new MyTask();
        EmailNotifications emailNotifications = new EmailNotifications();

        t.scheduleAtFixedRate(myTask, 0, 10000);

        System.out.println("After cron job runs..");
        System.out.println("Other codes will execute");

        t.scheduleAtFixedRate(emailNotifications, 0, 20000);

    }
}
