package InterfaceTest;

public class Cat extends Animal implements jumpping{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void jump() {
        System.out.println("猫可以跳高了");
    }

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }
}
