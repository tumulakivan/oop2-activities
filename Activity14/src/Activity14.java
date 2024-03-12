import java.util.Scanner;
import java.text.DecimalFormat;

public class Activity14 {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberHolder<Integer> intHolder = new NumberHolder<>();
        // intHolder.setNumber1(2);
        // intHolder.setNumber2(5);

        while(true) {
            try {
                System.out.print("Enter first integer: ");
                int number1 = sc.nextInt();
                intHolder.setNumber1(number1);
                break;
            } catch (Exception e) {
                e.printStackTrace();
                sc.next();
            }
        }

        while(true) {
            try {
                System.out.print("Enter second integer: ");
                int number2 = sc.nextInt();
                intHolder.setNumber2(number2);
                break;
            } catch (Exception e) {
                e.printStackTrace();
                sc.next();
            }
        }

        System.out.println("Sum of Integers: " + intHolder.sum());

        NumberHolder<Double> doubleHolder = new NumberHolder<>();

        while(true) {
            try {
                System.out.print("Enter first double: ");
                double number1 = sc.nextDouble();
                doubleHolder.setNumber1(number1);
                break;
            } catch (Exception e) {
                e.printStackTrace();
                sc.next();
            }
        }

        while(true) {
            try {
                System.out.print("Enter second double: ");
                double number2 = sc.nextDouble();
                doubleHolder.setNumber2(number2);
                break;
            } catch (Exception e) {
                e.printStackTrace();
                sc.next();
            }
        }

        System.out.println("Sum of Doubles: " + df.format(doubleHolder.sumDouble()));
    }
}