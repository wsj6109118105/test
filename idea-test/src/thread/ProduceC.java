package thread;

public class ProduceC {
    public static void main(String[] args) {
        Drop drop = new Drop();
        (new Thread(new Produce(drop))).start();
        (new Thread(new Consumer(drop))).start();
    }
}
