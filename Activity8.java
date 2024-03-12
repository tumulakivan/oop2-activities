class Animal {
    public void displayInfo() {
        System.out.println("I am an animal.");
    }
}

class Dog extends Animal {
    @Override
    public void displayInfo() {
        System.out.println("I am a dog.");
    }
}

public class Activity8 {
    public static void main(String[] args) {
        Animal obj1 = new Animal();
        obj1.displayInfo();
        Dog obj2 = new Dog();
        obj2.displayInfo();
    }
}