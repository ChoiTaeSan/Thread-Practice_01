
public class Main {
    static long startTime = 0;
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();

        Runnable r = new Thread2();
        Thread thread2 = new Thread(r);

        thread1.start();
        thread2.start();
        startTime = System.currentTimeMillis();
//        try{
//            thread1.join();
//
//        } catch (InterruptedException e){}
        System.out.println("소요시간 :"+(System.currentTimeMillis() - startTime));
    }
}
class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print(0);
        }
    }
}
class Thread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print(1);
        }
    }
}
