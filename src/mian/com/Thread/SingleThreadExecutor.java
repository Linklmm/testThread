package com.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*
* 关于线程中singleThreadexecutor的应用
* */
public class SingleThreadExecutor {
    public static void main(String[] args) {
        //executorservice对象是通过使用静态的executor方法创建的
        ExecutorService exec=Executors.newSingleThreadExecutor();
        for (int i=0;i<5;i++)
            exec.execute(new LiftOff());
        exec.shutdown();
    }
}
