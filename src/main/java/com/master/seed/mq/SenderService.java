package com.master.seed.mq;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.jms.Destination;

@Service
public class SenderService {

    @Autowired
    private Producter producter;

    @Scheduled(fixedDelay=1500)
    public void sendMessage() {
        Destination p2pMsg = new ActiveMQQueue("msg.p2p.from.windows.queue");
        producter.sendMessage(p2pMsg, "hello , this is jms msg");
    }
}
