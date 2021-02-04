package jicheng;

public class students extends person
{
    public students()
    {

    }
    public students(String name,int age){
        super(name, age);
    }
    public void study()
    {
        System.out.println(super.getName()+"好好学习");
    }
}
