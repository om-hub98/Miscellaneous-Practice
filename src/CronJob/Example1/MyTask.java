package CronJob.Example1;

import java.util.TimerTask;

public class MyTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("Hi my cron task is running....");
    }
}
