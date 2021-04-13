package Fanxing;

public class Box<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    public <U> void inspect(U u){
        System.out.println("T:"+t.getClass().getName());
        System.out.println("U:"+u.getClass().getName());
    }
}
