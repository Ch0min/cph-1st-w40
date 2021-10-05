package TaskTwo;

public class Main {

    public static void main(String[] args) {
        // 2.g
        Room kitchen = new Room(3, 1, 4, 2);
        Room garage = new Room(3,2, 2, 2);
        Room livingroom = new Room(2, 0, 5,3);

        // 2.i
        Building building = new Building(4, 1, 5, false);

        // 2.j
        int sum = kitchen.getNumberOfLamps() + garage.getNumberOfLamps() + livingroom.getNumberOfLamps();
        System.out.println("Total number of lamps: " + sum);

        // calling 2.k
        building.oddOrNot();

        // 2.H ?!"?#"?!#?!"#?!#?!?#"!?#?"!#?"!?

    }

}