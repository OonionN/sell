package com.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LogTest {

    @Test
    public void test1(){
        String name = "peng";
        String passwd = "123456";
        log.debug("debug...");
        log.info("info...");
        log.info("name: {}, passwd: {}", name, passwd);
        log.error("error...");
    }
}
