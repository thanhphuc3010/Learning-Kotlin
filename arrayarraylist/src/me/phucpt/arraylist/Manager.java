package me.phucpt.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Manager {
    private ArrayList<Contact> listContact = new ArrayList<Contact>();

    public Manager() {
    }

    public Manager(ArrayList<Contact> listContact) {
        this.listContact = listContact;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "listContact=" + listContact +
                '}';
    }

    public ArrayList<Contact> getListContact() {
        return listContact;
    }

    public void displayListContact() {
        for (Contact contact :
                listContact) {
            System.out.println(contact);
        }
    }

    private boolean isExited(String name, String phone) {
        for (Contact contact :
                listContact) {
            if (contact.getName() == name && contact.getPhone() == phone)
                return true;
        }
        return false;
    }

    public void addContact(String name, String phone) {
        if (!isExited(name, phone)) {
            Contact contact = new Contact(name, phone);
            listContact.add(contact);
            //System.out.println("Add successfully " + contact);
        } else {
            System.out.println("Contact is already exited");
        }
    }

    public void editContact(String name, String newPhone) {
        boolean isExited = false;
        for (Contact contact :
                listContact) {
            if (contact.getName() == name) {
                isExited = true;
                contact.setPhone(newPhone);
                System.out.println("Contact named " + name + " has changed into " + contact);
                System.out.println(listContact);
            }
        }
        if (!isExited) {
            System.out.println("Contact named " + name + " is not exited");
        }
    }

    public void swapContact(int c1, int c2) {
        // Set method set new value and return previous value
        Contact contact = listContact.set(c2, listContact.get(c1)); // contact hold the previous value at c2
        listContact.set(c1, contact);
    }

    private void sortByPhone() {
        int listSize = listContact.size();
        for (int i = 0; i < listSize - 1; i++) {
            for (int j = i + 1; j < listSize; j++) {
                Contact contact1 = listContact.get(i);
                Contact contact2 = listContact.get(j);
                if (contact1.getName() == contact2.getName() && contact1.getPhone().compareTo(contact2.getPhone()) > 0) {
                    swapContact(i, j);
                }
            }
        }
    }

    private void sortByName() {
        int listSize = listContact.size();
        for (int i = 0; i < listSize - 1; i++) {
            for (int j = i + 1; j < listSize; j++) {
                Contact contact1 = listContact.get(i);
                Contact contact2 = listContact.get(j);
                if (contact1.getLastName().compareTo(contact2.getLastName()) > 0) {
                    swapContact(i, j);
                }
            }
        }
    }

    public void sortListContact() {
        //listContact.sort(new SortByName());
        //sortByName();
        //sortByPhone();

        // Using comparator
        //listContact.sort(new SortByFirstName());

        Comparator<Contact> cm = Comparator.comparing(Contact::getFirstName)
                .thenComparing(Contact::getLastName)
                .thenComparing(Contact::getPhone);
        listContact.sort(cm);
    }

    public boolean checkContains(String key, String stringSearch) {
        int countCharacterFounded = 0;
        int indexFound = 0;
        for (int i = 0; i < key.length(); i++) {
            char ch1 = key.charAt(i);
            for (int j = indexFound; j < stringSearch.length();j++) {
                char ch2 = stringSearch.charAt(j);
                if (ch1 == ch2 || ch1 == Character.toUpperCase(ch2) || ch1 == Character.toLowerCase(ch2) ) {
                    countCharacterFounded++;
                    indexFound = j + 1;
                    break;
                }
            }
        }
        return countCharacterFounded == key.length();
    }

    public ArrayList<Contact> searchContact(String key) {
        ArrayList<Contact> result = new ArrayList<Contact>();
        for (Contact contact :
                listContact) {
            if (checkContains(key, contact.getName())) {
                result.add(contact);
            }
        }
        return result;
    }
}
