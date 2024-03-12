public class Activity11 {
    public<T> void display(T txt) {
        System.out.println("The value is " + txt);
    }

    public static void main(String[] args) {
        Activity11 obj = new Activity11();
        obj.display("IT Rocks!");
        obj.display(123);
        obj.display(1.23);
        obj.display('k');
        obj.display(true);
    }
}