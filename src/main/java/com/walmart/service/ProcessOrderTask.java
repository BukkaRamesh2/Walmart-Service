package com.walmart.service;

public class ProcessOrderTask implements Runnable{

    private final Long orderId;

    public ProcessOrderTask(Long orderId) {
        this.orderId = orderId;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
