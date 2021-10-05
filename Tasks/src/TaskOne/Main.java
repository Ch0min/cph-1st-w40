package TaskOne;

public class Main {

    public static void main(String[] args) {
        // 1.h
    Driver driver = new Driver("Mark", 22);
        // 1.i
    Car car1 = new Car("Mazda", "3", 2010, "Hatchback");
        // 1.l
    Car car2 = new Car("Toyota", "Aygo", 2007, "Hatchback");

        // 1.j
    car1.setDriver("Mark");
        // 1.k
        System.out.println(car1);
        System.out.println(driver);

        // 1.m
        System.out.println(car2);
        System.out.println(driver);

    }
}
