package AbstractTest;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void play() {
        System.out.println("狗追尾巴");
    }

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
}
