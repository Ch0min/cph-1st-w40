package TaskTwo;

    // 2.d
public class Building {
        private final int rooms;
        private int numberOfBathrooms;
        private int numberOfFloors;
        private boolean isOfficeBuilding;

        // 2.e
        Building(int rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding) {
            this.rooms = rooms;
            this.numberOfBathrooms = numberOfBathrooms;
            this.numberOfFloors = numberOfFloors;
            this.isOfficeBuilding = isOfficeBuilding;

        }

        // 2.f
        public int getRooms() {
            return rooms;
        }

        public int getNumberOfBathrooms() {
            return numberOfBathrooms;
        }

        public int getNumberOfFloors() {
            return numberOfFloors;
        }

        public boolean isOfficeBuilding() {
            return isOfficeBuilding;
        }

        // 2.k method
        public boolean oddOrNot() {
            if (numberOfFloors > rooms) {
                System.out.println("This is an odd building");
                return true;
            } else {
                return false;
            }
        }
    }
