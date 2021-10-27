package oop.equals;

public class Main {

    public static void main(String[] args) {

        Address address1 = new Address("Moscow", "Zelyonaya", 150);
        Address address2 = new Address("Moscow", "Zelyonaya", 150);

        if (address1.equals(address2)) {
            System.out.println("равны");
        } else {
            System.out.println("не равны");
        }

    }

}
