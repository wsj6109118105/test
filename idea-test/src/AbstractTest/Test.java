package AbstractTest;

public class Test {
    public static void main(String[] args) {
        Animal a = new Cat("小白",2);
        System.out.println(a.getName()+a.getAge()+"岁了");
        a.eat();
        a.play();
        Animal d = new Dog("大黄",3);
        System.out.println(d.getName()+d.getAge()+"岁了");
        d.play();
        d.eat();
    }
}
