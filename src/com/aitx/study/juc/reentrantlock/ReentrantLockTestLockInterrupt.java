package com.aitx.study.juc.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTestLockInterrupt {

    private static final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        try {
            lock.lockInterruptibly();
            System.out.println("hello world");
        } finally {
            lock.unlock();
        }
    }

}
