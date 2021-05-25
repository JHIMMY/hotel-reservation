package models;

public class Tester {
    public static void main(String[] args) {
        Customer customer = new Customer("first", "second", "j@domain.com");
        Customer customer2 = new Customer("Marcio", "Carvajal", "MariTo_33@facebook.com");
        System.out.println(customer);
        System.out.println(customer2);
    }
}
