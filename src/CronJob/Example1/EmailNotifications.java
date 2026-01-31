package CronJob.Example1;

import java.util.TimerTask;

public class EmailNotifications extends TimerTask {
    @Override
    public void run() {
        System.out.println("Send email notifications.....");
    }
}
