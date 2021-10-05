package TaskThree;

    // 3.a
public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;

    // 3.b
    Customer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }

        @Override
        public String toString() {
            // Making a newline for each customer
            String newLine = System.getProperty("line.separator");

            return newLine +"First name: " +firstName+ newLine +"- Last name: " +lastName+ newLine +"- User's username: " +username;
        }
        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getUsername() {
            return username;
        }

        public int getId() {
            return id;
        }

    }
