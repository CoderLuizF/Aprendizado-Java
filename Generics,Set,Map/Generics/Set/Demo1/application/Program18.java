package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program18 {

    public static void main(String[] args) {

//        Set<String> set = new HashSet<>();
//
//        set.add("Tv");
//        set.add("Notebook");
//        set.add("Tablet");
//        set.add("Sofá");
//        set.add("Cd");
//
//        System.out.println(set.contains("Notebook"));
//
//        set.remove("Cd");
//
//        set.removeIf(x -> x.charAt(0) == 'T');
//
//        for (String p : set) {
//            System.out.println(p);
//        }

        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //União
        Set<Integer> union = new TreeSet<>(a);
        union.addAll(b);
        System.out.println(union);

        //Interseção
        Set<Integer> intersection = new TreeSet<>(a);
        intersection.retainAll(b);
        System.out.println(intersection);


    }
}
