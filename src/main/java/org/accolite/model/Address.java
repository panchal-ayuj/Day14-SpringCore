package org.accolite.model;

public class Address {
    private String name1;
    private String name2;

    public Address(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }

    public Address() {
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name1='" + name1 + '\'' +
                ", name2='" + name2 + '\'' +
                '}';
    }
}
