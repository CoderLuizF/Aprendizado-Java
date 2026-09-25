package application;

import java.util.Map;
import java.util.TreeMap;

public class Program19 {

    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Luiz");
        cookies.put("email", "luiz@gmail.com");
        cookies.put("phone", "991234567");

        cookies.remove("email");
        cookies.put("phone", "9990367687");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));

        System.out.println("Username:  " + cookies.get("username"));

        System.out.println("ALL COOKIES: ");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }

    }
}
