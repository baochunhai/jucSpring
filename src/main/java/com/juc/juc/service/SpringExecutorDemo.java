package com.juc.juc.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class SpringExecutorDemo {
   int i = 1;
    @Autowired
    private AsyncTask task;

    public void method(){
        System.out.println("开始执行任务");
        List<Future> list = new ArrayList<>();
        for (int j = 0; j < 2; j++) {
            Future<Integer> method = task.method(i);
            list.add(method);
        }
        AtomicInteger result = new AtomicInteger();
        list.forEach((future)->{
            try {
                System.out.println("假装执行异步任务");
                result.addAndGet((int)future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
        System.out.println(result);
        System.out.println("结束执行任务");

    }



}
