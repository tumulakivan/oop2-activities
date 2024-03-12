import java.util.ArrayList;

public class Activity16 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);
        numbers.add(5);
        numbers.add(9);

        System.out.print("Elements in the list before update: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        numbers.set(0, 10);
        numbers.remove(Integer.valueOf(5));
        numbers.remove(3);

        System.out.print("Elements in the list after update: ");
        for(int number: numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println();

        ArrayList<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Gaea");
        names.add("Jeskin");
        names.add("Karen");
        names.add("Denzel");

        System.out.print("Names in the list before update: ");
        for(String name: names) {
            System.out.print(name + " ");
        }
    }
}