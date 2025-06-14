/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */

import java.util.concurrent.ExecutorService; 
import java.util.concurrent.Executors; 

class Task implements Runnable { 
    private int taskId;

    public Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " is being processed by " + Thread.currentThread().getName());
    }
}

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 5; i++) {
            executorService.submit(new Task(i));
        }
        executorService.shutdown();
    }
}