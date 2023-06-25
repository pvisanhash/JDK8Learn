package com.aitx.study.juc.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTestTryLock {

    private static final ReentrantLock lock = new ReentrantLock(true);

    public static void main(String[] args) {
        try {
            boolean b = lock.tryLock();
            System.out.println("hello world");
        } finally {
            lock.unlock();
        }
    }
}
