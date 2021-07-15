package me.phucpt.arraylist;

import java.util.Comparator;

class SortByFirstName implements Comparator<Contact> {
    @Override
    public int compare(Contact o1, Contact o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortByLastName implements Comparator<Contact> {
    @Override
    public int compare(Contact o1, Contact o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}