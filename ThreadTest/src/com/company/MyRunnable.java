package com.company;

/**
 * Created by huwenjing on 2017/4/12.
 */
public class MyRunnable implements Runnable{

    private int i =0;

    @Override
    public void run() {
        for(i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
