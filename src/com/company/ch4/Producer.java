package com.company.ch4;

public class Producer {
    Consumer consumer;

    public void doProduce() {
        consumer.doAction();
    }
}
