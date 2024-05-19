package dev.kei;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Scheduling a task to run every 2 seconds.
 */
public class App 
{
    private static final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

    public static void main( String[] args ) throws InterruptedException {
        var app = new App();
        app.printCurrentTimeEvery2Seconds("Task 1");
        app.printCurrentTimeEvery2Seconds("Task 2");
        // wait 15 seconds to shut down schedule
        Thread.sleep(15_000);
        app.stopScheduler();
    }

    // print out current time in every 2 second
    public void printCurrentTimeEvery2Seconds(String name) {
        // callback runnable function to use in schedule task
        System.out.println("Start schedule process in every 2 seconds...");
        Runnable print= () -> System.out.println("Current time for schedule " + name + " : " + LocalDateTime.now());
        scheduler.scheduleAtFixedRate(print, 0 , 2, TimeUnit.SECONDS);
    }

    // stop the scheduler
    public void stopScheduler() {
        scheduler.shutdown();;
        System.out.println("Schedule process end...");
    }
}
