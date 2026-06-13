package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program8 {

    public static void main(String[] args) {

        LocalDate d01 = LocalDate.now();
        System.out.println("Data local atual: " + d01);

        LocalDateTime d02 = LocalDateTime.now();
        System.out.println("Data local com horário: " + d02);

        Instant d03 = Instant.now();
        System.out.printf("Data local com fuso horário: " + d03);
    }
}
