package com.juc.juc;

import com.juc.juc.service.SpringExecutorDemo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
class JucApplicationTests {

    @Autowired
    private SpringExecutorDemo executorDemo;

    @Test
    void jucTest(){
        executorDemo.method();
    }
}
