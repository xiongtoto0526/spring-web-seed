package com.master.seed.mq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @JmsListener(destination = "msg.p2p.queue")
    public void processMessage(String content) {

        System.out.println("Receiving a message :" + content);

    }
}