package TaskOne;

    // 1.c
public class Car {
    private String make;
    private String model;
    private int year;
    private String bodyStyle;
    private String driver;

    // 1.d
    Car(String make, String model, int year, String bodyStyle) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;

    }
        // 1.e
        public String getDriver() {
            return driver;
        }

        public void setDriver(String driver) {
            this.driver = driver;
        }
        // 1.f
        @Override
        public String toString() {
            return "Make: " +make+ ". Model: " +model+ " ("+year+ "), BodyStyle: " +bodyStyle;

        }
    }
