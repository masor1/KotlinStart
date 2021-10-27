package oop.java.hashcode;

import oop.java.Address;

public class Main {

    public static void main(String[] args) {

        Address address1 = new Address("Москва", "Зеленая", 150);
        Address address2 = new Address("Москва", "Зеленая", 150);

        if (address1.equals(address2)) {

            System.out.println("равны");

        } else {

            System.out.println("не равны");

        }

        System.out.println(address1.hashCode());
        System.out.println(address2.hashCode());

    }

}
