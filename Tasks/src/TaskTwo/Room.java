package TaskTwo;
    // 2.a
public class Room {
    private int walls;
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    // 2.b
    Room(int walls, int numberOfDoors, int numberOfLamps, int numberOfWindows) {
        this.walls = walls;
        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;

    }
        // 2.c
        public int getWalls() {
            return walls;
        }

        public int getNumberOfDoors() {
            return numberOfDoors;
        }

        public int getNumberOfLamps() {
            return numberOfLamps;
        }

        public int getNumberOfWindows() {
            return numberOfWindows;
        }
    }
