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

        for(String x : list){
            System.out.println(x);
        }

    }
}
