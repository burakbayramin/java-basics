package com.burak.multithreding_concurrency.ThreadPool_ExecutorService;

public class Worker implements Runnable{

    private String name;
    private int taskId;

    public Worker(String name, int taskId) {
        this.name = name;
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Worker " + name + " start working " + taskId);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Worker " + name + "  finish working " + taskId);
    }
}
