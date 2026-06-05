package application;

import java.util.ArrayList;
import java.util.List;

public class Program6 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Luiz Felipe");
        list.add("Cássia");
        list.add("Sônia");
        list.add("Vinícius");
        list.add("Carlos");
        list.add(3, "José Luis");

        System.out.println(list.size());

        for(String x : list){
            System.out.println(x);
        }

        System.out.println("--------------------");
        list.remove("José Luis");
        list.remove(3);
        //remover com um predicado (que retorna um verdadeiro ou falso)
        list.removeIf(x -> x.charAt(0) == 'S');

        for(String x : list) {
            System.out.println(x);
        }

        System.out.println("--------------------");
        System.out.println("Index of Cássia: " + list.indexOf("Cássia"));

        System.out.println("--------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'C').toList();
        for(String x : result) {
            System.out.println(x);
        }

        //Encontrar um elemento por meio de um predicado (primeiro elemento que começa com 'C')
        System.out.println("--------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'C').findFirst().orElse(null);
        System.out.println(name);

    }
}
