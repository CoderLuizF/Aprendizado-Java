package application;

import entities.ProdEx;

import java.util.HashMap;
import java.util.Map;

public class Program20 {

    public static void main(String[] args) {

        Map<ProdEx, Double> stock = new HashMap<>();

        ProdEx p1 = new ProdEx("Tv", 900.0);
        ProdEx p2 = new ProdEx("Notebook", 1200.0);
        ProdEx p3 = new ProdEx("Tablet", 400.0);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        ProdEx ps = new ProdEx("Tv", 900.0);

        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

    }
}
