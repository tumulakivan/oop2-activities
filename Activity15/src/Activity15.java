import java.sql.SQLOutput;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Activity15 {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        // MySubclass<String> objSub = new MySubclass<>("Ivan Steiven A. Tumulak");
        Scanner sc = new Scanner(System.in);
        String name;
        char middleInitial;
        int age;
        double cash;

        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter cash: ");
        cash = sc.nextDouble();
        System.out.print("Enter middle initial: ");
        middleInitial = sc.next().charAt(0);

        MySubclass<String, Integer, Double, Character> objSub = new MySubclass<>(name, age, cash, middleInitial);

        System.out.println();
        System.out.println();
        System.out.println("Name: " + objSub.getValueT());
        System.out.println("Age: " + objSub.getValueU());
        System.out.println("Cash: " + df.format(objSub.getValueV()));
        System.out.println("Middle Initial: " + objSub.getValueW() + ".");
    }
}