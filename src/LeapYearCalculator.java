import java.util.Scanner;
public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter the year: ");
        year = scanner.nextInt();
        boolean isLeap = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        if(isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if(isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
            if (isDivisibleBy400){
                isLeap = true;

            } else{
                isLeap = true;
            }
            }
        }
        if(isLeap){
            System.out.println("%d is a leap year" + year);

        } else {
            System.out.println("%d is not a leap year" + year);
        }
    }

}

