import java.util.Scanner;
import java.text.DecimalFormat;

public class Activity4 {
    private String namePerson;
    private double cash;

    private static final DecimalFormat df = new DecimalFormat("#.00");

    public String getName() {
        return namePerson;
    }

    public void setName(String namePerson) {
        this.namePerson = namePerson;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public static void main(String[] args) {
        Activity4 objPerson = new Activity4();
        Scanner sc = new Scanner(System.in);
        String name;
        double cash;

        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter cash: ");
        cash = sc.nextDouble();
        objPerson.setName(name);
        objPerson.setCash(cash);

        System.out.println(objPerson.getName());
        System.out.println(df.format(objPerson.getCash()));
    }
}