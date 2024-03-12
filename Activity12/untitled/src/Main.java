import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("#.00");


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intData;
        double doubleData;
        String stringData;

        GenericClass<Integer> intObj = new GenericClass<>();
        GenericClass<Double> doubleObj = new GenericClass<>();
        GenericClass<String> stringObj = new GenericClass<>();

        boolean intDataValid = false;
        while(!intDataValid) {
            try {
                System.out.print("Enter an integer: ");
                intData = sc.nextInt();
                intDataValid = true;
                sc.nextLine();

                intObj.setData(intData);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input.");
                sc.next();
            }
        }

        boolean doubleDataValid = false;
        while(!doubleDataValid) {
            try {
                System.out.print("Enter a double: ");
                doubleData = sc.nextDouble();
                doubleDataValid = true;
                sc.nextLine();

                doubleObj.setData(doubleData);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input.");
                sc.next();
            }
        }

        boolean stringDataValid = false;
        while(!stringDataValid) {
            try {
                System.out.print("Enter a string: ");
                stringData = sc.nextLine();
                stringDataValid = true;

                stringObj.setData(stringData);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input.");
                sc.next();
            }
        }

        System.out.println("Generic Class returns: " + intObj.getData());
        System.out.println("Generic Class returns: " + df.format(doubleObj.getData()));
        System.out.println("Generic Class returns: " + stringObj.getData());
    }
}