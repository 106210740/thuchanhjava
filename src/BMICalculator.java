import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Enter weight in kilograms: ");
        weight = sc.nextDouble();
        System.out.print("Enter height in meter: ");
        height = sc.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if (bmi < 18) {
            System.out.println("%-20.2f%s" + bmi + "Underweight");
        }
        else if (bmi < 25.0) {
            System.out.println("%-20.2f%s " + bmi + "Normal");
        }
        else if(bmi < 30.0){
            System.out.println("%-20.2f%s " + bmi + "Overweight");
            }
        else
            System.out.println("%-20.2f%s " + bmi + "Obese");
    }
}
