public class HealthAdvices extends BMITest
{
    private double weight;
    private double height;
    private double BMI;
    
    public HealthAdvices(double weight, double height)
    {
        setWeight (weight);
        setHeight (height);
        setBMI (BMI);
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getHeight()
    {
        return height;
    }

    public void setBMI(double BMI)
    {
        this.BMI = BMI;
    }

    public double getBMI()
    {
        return BMI = weight / (height * height);
    }
    
    public double BMI()
    {
        return weight / (height * height);
    }
        
    public String Advices()
    {
        if (BMI < 18.5)      
        {
            return String.format("BMI Classification: Underweight\n" + "\n" +
            "What happens when one is underweight?\n" + "\n" +
            "1. Underweight increase one’s risk of health problems.\n"+
            "2. Being underweight is linked with heart problems, lowered resistance to infection, chronic fatigue and etc.\n" + "\n" +
            "How does one gain weight in a healthy way?\n" + "\n" +
            "1. Aim for a gradual weight gain, which should be about 1 to 2 kilogram per month. You should aim for a BMI between 18.5 and 24.9 kg/m²\n"+
            "2. Practise healthy eating, practice choose and eat a variety of foods daily as guided by the Malaysian Food Pyramid.\n"+
            "3. Avoid skipping meals.\n" +
            "4. Plan ahead for extra meals. To gain weight, you may need to eat more nutritions foods.\n" +
            "5. Snack smartly by choosing nutrient-densed snacks that add calories, vitamins and minerals.\n" +
            "6. Check your energy requirement. Don’t forget that you need to indicate what your physical activity level is in order to calculate your daily energy requirement.\n" +
            "7. Refer to the sample menu. Choose the menu that suits your daily calorie requirement.");
        }
    
        else if ((BMI() >= 18.5) && (BMI() < 25))
        {
            return String.format("BMI Classification: Normal\n" + "\n" +
            "What is a healthy weight?\n" + "\n" +
            "1. A healthy weight falls within BMI of 18.5 to 24.9 kg/m²\n" +
            "2. Studies have shown that people whose BMI are within this range tend to live longer than people who have lower or higher BMI.\n" + "\n" +
            "How to maintain normal body weight?\n" + "\n" +
            "1. Balance the food that you eat with physical activity.\n" +
            "2. Do more physical activity. If you are already very active, try to continue the same level of activity suitable to your age.");
        }
    
        else if ((BMI() >= 25.0) && (BMI() < 30))
        {
            return String.format("BMI Classification: Overweight\n" + "\n" +
            "When is one considered overweight?\n" + "\n" +
            "1. You are overweight if your BMI is between 25.0 to 30.0\n" + "\n" +
            "How can you lose weight?\n" + "\n" +
            "1. Weight yourself once a week, preferably before meal.\n" +
            "2. Set a realistic target to reduce half kilogram of body weight per week.\n" +
            "3. Check your energy requirement.\n" +
            "4. Eat normal, reasonable, moderate amounts of nutritious foods based on the Malaysian Food Pyramid.\n" +
            "5. Don’t ever diet or restrict calories when you are really hungry. If you do, you will tend to binge later.\n" +
            "6. Do some diet modification.\n" +
            "7. Reduce or avoid foods high in sugar and fat such as butter, cream, fatty meat, salad dressing, rich cake and pastries.\n" +
            "8. Consult the dietician or nutritionist for further weight management.\n" +
            "9. Consult a doctor to identify and correct any underlying medical, biological, or physiological problems contributing to excess weight.\n" +
            "10. Find a support system. Friends are great; so are support groups.");
        }
    
        else
        {
            return String.format("BMI Classification: Obese\n" + "\n" +
            "When is one considered obese?\n" + "\n" +
            "1. You are obese if your BMI is 30 or more.\n"+ "\n" +
            "How can you lose weight?\n" + "\n" +
            "1. Weight yourself once a week, preferably before meal.\n" +
            "2. Set a realistic target to reduce half kilogram of body weight per week.\n" +
            "3. Check your energy requirement.\n" +
            "4. Eat normal, reasonable, moderate amounts of nutritious foods based on the Malaysian Food Pyramid.\n" +
            "5. Don’t ever diet or restrict calories when you are really hungry. If you do, you will tend to binge later.\n" +
            "6. Do some diet modification.\n" +
            "7. Reduce or avoid foods high in sugar and fat such as butter, cream, fatty meat, salad dressing, rich cake and pastries.\n" +
            "8. Consult the dietician or nutritionist for further weight management.\n" +
            "9. Consult a doctor to identify and correct any underlying medical, biological, or physiological problems contributing to excess weight.\n" +
            "10. Find a support system. Friends are great; so are support groups.");
        }
    }
}