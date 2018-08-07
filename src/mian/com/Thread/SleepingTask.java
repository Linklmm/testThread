package com.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SleepingTask extends LiftOff {
    public void run(){
        try {
            while (countDown-- >0){
                System.out.print(status());
                //从前的sleep调用
                //Thread.sleep(100);
                TimeUnit.MILLISECONDS.sleep(100);
            }
        } catch (InterruptedException e) {
            System.err.println("Interrupted");
        }
    }

    public static void main(String[] args) {
        ExecutorService exec=Executors.newCachedThreadPool();
        for (int i=0;i<5;i++)
            exec.execute(new SleepingTask());
        exec.shutdown();
    }
}
