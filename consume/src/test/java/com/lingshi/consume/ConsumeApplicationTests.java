package com.lingshi.consume;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsumeApplicationTests {

    @Test
    public void contextLoads() {
        String str = "11111111111123151515.1515 15615145#41455415611";
        System.out.println("data: "+str.length());
    }

}
