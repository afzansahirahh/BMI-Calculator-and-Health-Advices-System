public class BMI extends BMITest
{
    private String name;
    private int age;
   
    public BMI ()
    {
        
    }
    
    public BMI (String name, int age, double weight, double height, double BMI)
    {
        setName (name);
        setAge (age);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }
}