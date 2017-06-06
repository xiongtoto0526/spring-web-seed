package com.master.seed;

import com.master.seed.mq.Producter;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.Destination;


/**
 * 1. http://localhost:8161 is available
 * 2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ActiveMqTest {

    @Autowired
    private Producter producter;

    @Test
    public void contextLoads() {
        Destination p2pMsg = new ActiveMQQueue("msg.p2p.queue");
        producter.sendMessage(p2pMsg , "hello , this is jms msg");
    }

}