package com.aitx.study.juc.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 试验ReentrantLock加锁流程
 */
public class ReentrantLockTestLock {


    /**
     * 默认为非公平锁
     */
    private static final ReentrantLock lock = new ReentrantLock();


    public static void main(String[] args) {
        try {
            lock.lock();
            System.out.println("hello world");
        } finally {
            // 解锁方法一定要放到finally里面去，因为lock锁在遇到异常时不会主动释放锁
            lock.unlock();
        }

    }
}
