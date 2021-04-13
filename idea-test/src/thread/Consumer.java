package thread;




public class Consumer implements Runnable{

    Drop drop;
    public Consumer(Drop drop){
        this.drop=drop;
    }
    @Override
    public void run() {
        String message = drop.take();
        while (!message.equals("over")){
            System.out.println("message"+message);
            message=drop.take();
        }
    }
}
