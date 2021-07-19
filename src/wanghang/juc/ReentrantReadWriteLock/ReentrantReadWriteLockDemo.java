package wanghang.juc.ReentrantReadWriteLock;


import java.util.concurrent.locks.ReentrantReadWriteLock;

/**

 1)java关于读写锁的实现原理：
 核心思想：对于共享资源,读大于写的场景：读读不互斥,读写互斥,谢谢互斥。
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
