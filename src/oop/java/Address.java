package oop.java;

import java.util.Objects;

public class Address {
    private String citi;
    private String street;
    private int numberOfHouse;

    public Address(String citi, String street, int numberOfHouse) {
        this.citi = citi;
        this.street = street;
        this.numberOfHouse = numberOfHouse;
    }

    public String getCiti() {
        return citi;
    }

    public void setCiti(String citi) {
        this.citi = citi;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumberOfHouse() {
        return numberOfHouse;
    }

    public void setNumberOfHouse(int numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return numberOfHouse == address.numberOfHouse && Objects.equals(citi, address.citi) && Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(citi, street, numberOfHouse);
    }

    //    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (hashCode() != obj.hashCode()) {
//            return false;
//        }
//        if (obj instanceof Address) {
//            Address address = (Address) obj;
//            return this.citi.equals(address.citi) &&
//                    this.street.equals(address.street) &&
//                    this.numberOfHouse == address.numberOfHouse;
//        } else {
//            return false;
//        }
//    }
//
//    @Override
//    public int hashCode() {
//        return citi.hashCode() + street.hashCode() + numberOfHouse;
//    }
}
