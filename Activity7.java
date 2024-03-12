public class Activity7 {
    void sum(int a, int b) {
        int c = a + b;
        System.out.println("Addition of 2 numbers: " + c);
    }

    void sum (int a, int b, int e) {
        int c = a + b + e;
        System.out.println("Addition of 3 numbers: " + c);
    }

    public static void main(String[] args) {
        Activity7 obj = new Activity7();
        obj.sum(30, 90);
        obj.sum(45, 80, 22);
    }
}