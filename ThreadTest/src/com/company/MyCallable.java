package com.company;

import java.util.concurrent.Callable;

/**
 * Created by huwenjing on 2017/4/12.
 */
public class MyCallable implements Callable<Integer> {

    private int i =0;

    @Override
    public Integer call() throws Exception {
        int sum=0;
        for(;i<100;i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
            sum += i;
        }
        return sum;
    }
}
