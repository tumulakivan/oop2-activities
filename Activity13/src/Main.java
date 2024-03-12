import java.text.DecimalFormat;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("#.00");

    public static void main(String[] args) {
        try {
            GenericClass<Integer, Double> obj = new GenericClass<>();
            obj.setData1(26);
            obj.setData2(50.25);
            System.out.println("Generic Class returns: " + obj.getData1() + " " + obj.getData2());
            Class.forName("GenericClass");
            System.out.println(obj);
        } catch(ClassNotFoundException e) {
            System.out.println("Invalid Class.");
        }
    }
}