package me.phucpt.arraylist;

import java.util.Comparator;

public class Contact {
    private String name;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Contact() {
    }

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String getFirstName() {
        int index = name.indexOf(' ');
        return name.substring(0, index);
    }

    public String getLastName() {
        int index = name.lastIndexOf(' ');
        return name.substring(index + 1);
    }
}

