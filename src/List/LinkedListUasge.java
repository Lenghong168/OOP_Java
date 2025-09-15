package List;

import java.util.ArrayList;

public class LinkedListUasge {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Lita");
        names.addFirst("Sinat");

        System.out.println("First element: " + names.get(0));

        names.set(1, "Devid");

        names.remove(0);
        names.remove("Bob");


        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("Size of Array: " +names.size());
    }
}
