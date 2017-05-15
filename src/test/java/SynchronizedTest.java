import java.util.LinkedList;
import java.util.List;

/**
 * SynchronizedTest
 * PACKAGE_NAME
 *
 * @author xiaoyy
 * 内置锁demo
 * @Date 2017-05-09 下午1:37
 * The word 'impossible' is not in my dictionary.
 */
public class SynchronizedTest {
    public static void main(String[] args) {
        List list = new LinkedList();
        Thread r = new Thread(new ReadList(list));
        Thread w = new Thread(new WriteList(list));
        r.start();
        w.start();
    }
}


class ReadList implements Runnable{

    private List list;

    public ReadList(List list){ this.list = list; }

    public void run(){
        System.out.println("ReadList begin at "+System.currentTimeMillis());
        // 开启内置锁
        synchronized (list){
            try {
                Thread.sleep(1000);
                System.out.println("list.wait() begin at "+System.currentTimeMillis());
                // 立即释放当前锁
                list.wait();
                System.out.println("list.wait() end at "+System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("ReadList end at "+System.currentTimeMillis());

    }
}

class WriteList implements Runnable{

    private List list;

    public WriteList(List list){ this.list = list; }

    public void run(){
        System.out.println("WriteList begin at "+System.currentTimeMillis());
        // 开启内置锁
        synchronized (list){
            System.out.println("get lock at "+System.currentTimeMillis());
            // 等待内置锁内方法执行完再释放当前锁
            list.notify();
            System.out.println("list.notify() at "+System.currentTimeMillis());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("get out of block at "+System.currentTimeMillis());
        }
        System.out.println("WriteList end at "+System.currentTimeMillis());

    }
}