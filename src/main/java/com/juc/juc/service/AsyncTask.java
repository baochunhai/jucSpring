package com.juc.juc.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;
import java.util.concurrent.Future;

@Component
public class AsyncTask {

    @Async(value = "springExecutor" )
    public Future<Integer> method(int i){
        i++;
        return new AsyncResult<>(i);
    }
}
