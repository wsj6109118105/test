package Fanxing;

public class BoxText {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<String>();
        stringBox.setT("wang");
        System.out.println(stringBox.getT());
        Box<String> stringBox1=new Box<String>();
        stringBox1.setT("li");
        stringBox1.inspect(10);
    }
}
