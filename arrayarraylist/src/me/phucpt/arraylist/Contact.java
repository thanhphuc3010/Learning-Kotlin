package me.phucpt.arraylist;

import java.util.Comparator;

public class Contact implements Comparable<Contact>{
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

//    @Override
//    public int compare(Contact o1, Contact o2) {
//        return o1.getLastName().compareTo(o2.getLastName());
//    }
    @Override
    public int compareTo(Contact o) {
        if (getLastName().compareTo(o.getLastName()) < 0) {
            return -1;
        } else if (getLastName().compareTo(o.getLastName()) > 0) {
            return 1;
        } else {
            if (getFirstName().compareTo(o.getFirstName()) < 0) {
                return -1;
            } else if (getFirstName().compareTo(o.getFirstName()) > 0) {
                return 1;
            } else {
                return getFirstName().compareTo(o.getFirstName());
            }
        }
    }
}

