package thread;


public class Produce implements Runnable{

    Drop drop;
    public Produce(Drop drop){
        this.drop=drop;
    }
    @Override
    public void run() {
        String important[] = {"消息1","消息2","消息3","消息4"};
        for(int i=0;i<important.length;i++){
            drop.put(important[i]);
        }
        drop.put("over");
    }
}
