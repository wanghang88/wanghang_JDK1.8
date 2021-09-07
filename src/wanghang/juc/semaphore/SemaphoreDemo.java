package wanghang.juc.semaphore;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**

  基于AQS实现Semaphore
  https://blog.csdn.net/javazejian/article/details/76167357


  Semaphore 的使用
  https://adong.blog.csdn.net/article/details/81135500

 */
public class SemaphoreDemo {
    public static void main(String[] args) {
        TestSemaphone semaphone = new TestSemaphone();
        ExecutorService exec = Executors.newFixedThreadPool(20);
        for (int i = 0; i < 20; i++) {
            exec.submit(semaphone);
        }
        exec.shutdown();
    }







    //内部类
    static class TestSemaphone implements Runnable {
        private final Semaphore semaphore = new Semaphore(5);

        public void run() {
            try {
                /**
                 * 尝试获得一个许可，不断尝试，直到获得许可
                 */
                semaphore.acquire();
                /**
                 * 模拟耗时操作
                 */
                Thread.sleep(2000);

                System.out.println(Thread.currentThread().getId() + ":" + Thread.currentThread().getName() + " done!");

                /**
                 * 释放许可
                 */
                semaphore.release();
            } catch (InterruptedException e) {

            } finally {

            }
        }
    }
}