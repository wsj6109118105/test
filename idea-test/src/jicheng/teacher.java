package jicheng;

public class teacher extends person
{
    public teacher(){

    }
    public teacher(String name,int age){
        super(name, age);
    }
    public void teach()
    {
        System.out.println(super.getName()+"教书育人");
    }
}
