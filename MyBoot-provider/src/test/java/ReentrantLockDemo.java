import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLockTest
 * PACKAGE_NAME
 *
 * @author xiaoyy
 *         互斥锁demo
 * @Date 2017-05-11 上午9:53
 * The word 'impossible' is not in my dictionary.
 */
public class ReentrantLockDemo {

    private static class Counter {

        private ReentrantLock reentrantLock = new ReentrantLock();

        public void count() {
            reentrantLock.lock();
            try {
                for (int i = 0; i < 6; i++) {
                    System.out.println(Thread.currentThread().getName() + ", i = " + i);
                }
            } finally {
                // 必须在finally释放锁
                reentrantLock.unlock();
            }
        }

    }

    private static class MyThread extends Thread {

        private Counter mCounter;

        private String mName;

        public MyThread(Counter counter, String name) {
            mCounter = counter;
            mName = name;
        }

        @Override
        public void run() {
            System.out.println("start thread " + mName);
            super.run();
            mCounter.count();
            System.out.println("end thread " + mName);
        }

    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        // myThread1和myThread2是调用同一个对象counter
        MyThread thread1 = new MyThread(counter, "thread1");
        MyThread thread2 = new MyThread(counter, "thread2");
        thread1.run();
        thread2.run();
    }

}
