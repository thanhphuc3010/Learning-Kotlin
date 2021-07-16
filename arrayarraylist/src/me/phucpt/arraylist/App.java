package me.phucpt.arraylist;

import java.util.Collections;

public class App {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.addContact("Pham Thanh Phuc","0318848155");
        manager.addContact("Nguyen Thi Hoan","0969782000");
        manager.addContact("Dang Thi Lanh","0945438879");
        manager.addContact("Nguyen Thu Trang","0972225783");
        manager.addContact("ToHoang", "0974553876");
        manager.addContact("Thang", "0365151999");
        manager.addContact("Pham Thanh Phuc", "0218954229");

        Collections.sort(manager.getListContact());
       // manager.sortListContact();
        manager.displayListContact();

        for (Contact item:
             manager.searchContact("Thang")) {
            System.out.println(item);
        }
    }
}
