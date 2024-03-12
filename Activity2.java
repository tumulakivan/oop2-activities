public class Activity2 {
    int age;
    String name;

    public Activity2(int y, String nm) {
        this.age = y;
        this.name = nm;
    }

    public static void main(String[] args) {
        Activity2 obj = new Activity2(21, "Ivan");
        System.out.println(obj.name + " " + obj.age);
    }
}