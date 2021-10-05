package TaskThree;

import java.util.ArrayList;

public class Main {
    // 3.c
    public static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        Customer c1 = new Customer("Mark", "Lundgaard", "Chomin");
        Customer c2 = new Customer("Cecilie", "Nielsen", "CN");
        Customer c3 = new Customer("Nick", "Jensen", "NickJ");
        Customer c4 = new Customer("Tarzan", "Orange", "Tarzo");
        Customer c5 = new Customer("Susanne", "Nygaard", "SusNy");
        Customer c6 = new Customer("Brian", "Svend", "BrianS");

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        customers.add(c5);
        customers.add(c6);
        printCustomers();

    }
    // 3.d
    public static void printCustomers() {
        for (Customer c : customers) {
            System.out.println(c);

        }
    }
}

