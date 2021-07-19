package wanghang.juc.StampedLock;


import java.util.concurrent.locks.StampedLock;

/**
 *     1)StampedLock和ReadWriteLock相比,改进之处在于:
 *     读的过程中也允许获取写锁后写入！这样一来，我们读的数据就可能不一致,但是StampedLock是有处理的，在读取完成之后会有判断,判断读取过程中是否有写入,有写入的话重新读取，然后加读锁，重新执行相应的逻辑。
 *     乐观读锁和乐观写锁:
 *     乐观锁的意思就是乐观地估计读的过程中大概率不会有写入，因此被称为乐观锁。反过来，悲观锁则是读的过程中拒绝有写入，也就是写入必须等待.

       2)StampedLock读写锁的逻辑处理可以参考这篇博文：
       https://www.liaoxuefeng.com/wiki/1252599548343744/1309138673991714

 *
 */
public class StampedLockDemo {


    public static void main(String[] args) {
        StampedLock stampedLock=new StampedLock();



    }


}
