package GC;

public class DeadLockCase {
    public static void main(String[] args){
        Object o1 = new Object();
        Object o2 = new Object();
        new Thread(new SyncThread(o1, o2),  "t1").start();
        new Thread(new SyncThread(o2, o1),  "t2").start();
    }

    static class SyncThread implements Runnable {
        private Object lock1;
        private Object lock2;

        public SyncThread(Object o1, Object o2){
            this.lock1 = o1;
            this.lock2 = o2;
        }

        @Override
        public void run() {
            String name = Thread.currentThread().getName();
            System.out.println(name + " 1 " + lock1);
            synchronized (lock1) {
                System.out.println(name + " 2 " + lock1);
                work();
                System.out.println(name + " 3 " + lock2);
                synchronized (lock2) {
                    System.out.println(name + " 4 " + lock2);
                    work();
                }
                System.out.println(name + " 5 " + lock2);
            }
            System.out.println(name + " 6 " + lock1);
        }

        private void work() {
            try {
                //模拟死锁的关键，保证线程1只能获取一个锁，而线程2能获取到另一个锁
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}