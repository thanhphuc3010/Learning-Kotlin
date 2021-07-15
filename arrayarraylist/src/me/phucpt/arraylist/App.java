package me.phucpt.arraylist;

public class App {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.addContact("Pham Thanh Phuc","0318848155");
        manager.addContact("Nguyen Thi Hoan","0969782000");
        manager.addContact("Dang Thi Lanh","0945438879");
        manager.addContact("Nguyen Thu Trang","0972225783");
        manager.addContact("Nguyen Thuy Dung", "0974553876");
        manager.addContact("Le Kim Hong", "0365151999");
        manager.addContact("Pham Thanh Phuc", "0918954229");

        manager.sortListContact();

        manager.displayListContact();
    }
}
