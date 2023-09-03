import java.util.Scanner;
public class BMITest
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);

        System.out.println("Hello! Welcome to BMI Calculator System!");
        System.out.println("Please enter your information below.");
        System.out.println("");
        
        System.out.print("Enter name: ");
        String name = input.nextLine();
        
        System.out.print("Enter age: ");
        int age = input.nextInt();
        
        System.out.print("Enter weight(kg): ");
        double weight = input.nextDouble();
        
        System.out.print("Enter height(m): ");
        double height = input.nextDouble();
        
        System.out.print("\n");
        
        HealthAdvices objHealthAdvices = new HealthAdvices (weight, height);
        
        System.out.printf("BMI: " + objHealthAdvices.getBMI() + "\n" + objHealthAdvices.Advices());
        System.out.print("\n");
    }
}