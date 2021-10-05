package TaskOne;
    // 1.a
public class Driver {
    private String name;
    private int age;

    // 1.b
        Driver(String name, int age) {
        this.name = name;
        this.age = age;

    }

    // 1.g
        @Override
        public String toString() {
            return "is driven by " + name;
        }
    }
