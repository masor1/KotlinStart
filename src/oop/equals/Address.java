package oop.equals;

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
    public boolean equals(Object obj) {
        if (obj instanceof Address) {
            Address address = (Address) obj;
            return this.citi.equals(address.citi) &&
                    this.street.equals(address.street) &&
                    this.numberOfHouse == address.numberOfHouse;
        } else {
            return false;
        }
    }
}
