public class Activity3 {
    String carMake, carModel;
    int carYear;

    public Activity3(String carMake, String carModel, int carYear) {
        this.carMake = carMake;
        this.carModel = carModel;
        this.carYear = carYear;
    }

    @Override
    public String toString() {
        return this.carMake + " " + this.carModel + " " + this.carYear;
    }

    public static void main(String[] args) {
        Activity3 wigo = new Activity3("Toyota", "Wigo", 2022);
        Activity3 civic = new Activity3("Honda", "Civic", 2018);
        Activity3 mustang = new Activity3("Ford", "Mustang", 2008);
        Activity3 miata = new Activity3("Mazda", "Miata", 1996);

        System.out.println(miata);
    }
}