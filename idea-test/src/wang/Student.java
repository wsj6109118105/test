package wang;

public class Student
{
    String name;
    private int age;

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        if(age<0||age>120)
        {
            System.out.println("输入年龄有误");
            this.age = 20;
        }
        else {
            this.age = age;
        }
    }
    public void show()
    {
        System.out.println(name + " " + age);
    }
}
