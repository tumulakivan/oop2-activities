public class Activity1 {
    public static int x = 5;

    public static void main(String[] args) {
        newObject obj1 = new newObject();
        obj1.objPrint(x);
        do {
            System.out.println("IT ROCKS!");
            x--;
        } while(x != 0);
    }
}

class newObject {
    public void objPrint(int num) {
        System.out.println(num);
    }
}