package application;

import java.util.HashSet;
import java.util.Set;

public class Program18 {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Tv");
        set.add("Notebook");
        set.add("Tablet");
        set.add("Sofá");
        set.add("Cd");

        System.out.println(set.contains("Notebook"));

        set.remove("Tablet");

        set.removeIf(x -> x.length() >=5);

        for (String p : set) {
            System.out.println(p);
        }

    }
}
