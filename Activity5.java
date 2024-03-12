class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound...");
    }

    public void displayName() {
        System.out.println("I'm generic animal.");
    }
}

class Dog extends Animal {

}

class Cat extends Dog {

}

public class Activity5 {
    public static void main(String[] args) {
        Animal objAnimal = new Animal();
        Dog objDog = new Dog();
        Cat objCat = new Cat();

        objAnimal.makeSound();
        objAnimal.displayName();
        objDog.makeSound();
        objDog.displayName();
        objCat.makeSound();
        objCat.displayName();
    }
}