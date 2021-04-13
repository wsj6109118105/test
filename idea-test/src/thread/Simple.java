package thread;

import java.io.IOException;

public class Simple {
    static void print(String m) {
        String s = Thread.currentThread().getName();
        System.out.println(s + m);
    }

    private static class mLoop implements Runnable {
        @Override
        public void run() {
            String[] info = {"消息1", "消息2", "消息3", "消息4"};
            try {
                for (String s : info) {
                    Thread.sleep(4000);
                    print(s);
                }
            }
            catch (InterruptedException e){
                print("超时");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException{
        long time = 1000*10;
        if(args.length>0)
        {
            try{
                time = Long.parseLong(args[0])*1000;
            }
            catch (NumberFormatException e)
            {
                System.out.println("参数需为整数");
                System.exit(1);
            }
        }
        print("启动mLoop线程");
        long starttime = System.currentTimeMillis();
        Thread t = new Thread(new mLoop());
        t.start();
        print("等待线程mLoop结束");
        while (t.isAlive())
        {
            print("继续等待");
            t.join(1000);
            if(((System.currentTimeMillis()-starttime)>time&&t.isAlive()))
            {
                print("超时");
                t.interrupt();
                t.join();
            }
        }
        print("mLoop线程结束");
    }
}
