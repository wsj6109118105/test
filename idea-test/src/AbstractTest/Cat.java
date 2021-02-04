package AbstractTest;

public class Cat extends Animal
{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void play() {
        System.out.println("猫躲猫猫");
    }

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }
}
