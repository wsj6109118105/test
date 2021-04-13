package thread;

public class ThreadTest implements Runnable{
    public static int a=0;
    @Override
    public void run()
    {
        for (int i=0;i<5;i++)
        {
            a+=1;

        }
    }

    public static void main(String[] args) throws InterruptedException{
        Thread t = new Thread(new ThreadTest());
        t.start();
        t.join();
        System.out.println(a);
    }
}
