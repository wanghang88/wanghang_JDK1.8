package wanghang.juc.ReentrantReadWriteLock;


import java.util.concurrent.locks.ReentrantReadWriteLock;

/**

 1)java关于读写锁的实现原理：
 核心思想：1)对于共享资源,读大于写的场景：读读不互斥,读写互斥,谢谢互斥
         2)可以解决多线程同时读，但只有一个线程能写的问题,这有一种问题，也就是性能比较查：
             如果有线程正在读，写线程需要等待读线程释放锁后才能获取写锁，即读的过程中不允许写，这是一种悲观的读锁？  这中情况下的写性能就比较差， 还需要优化。
             java8就引入了StampedLock

 2)查看源码：
         通过查看这篇博文：
           读锁的获取，读锁的释放和写锁的获取，写锁的释放这逻辑来看。
           具体逻辑还得看实际的场景
           https://blog.csdn.net/yupi1057/article/details/80787013

 */
public class ReentrantReadWriteLockDemo {


    public static void main(String[] args){
        ReentrantReadWriteLock reentrantReadWriteLock=new ReentrantReadWriteLock();




    }
}
