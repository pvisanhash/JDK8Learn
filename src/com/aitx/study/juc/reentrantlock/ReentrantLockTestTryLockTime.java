package com.aitx.study.juc.reentrantlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTestTryLockTime {

    private static final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        try {
            boolean b = lock.tryLock(3, TimeUnit.SECONDS);
            System.out.println("hello world");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
