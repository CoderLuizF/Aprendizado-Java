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

        System.out.println();
        LocalDate d04 = LocalDate.parse("2026-05-02");
        System.out.println("Texto para data-hora: " + d04);

        LocalDateTime d05 = LocalDateTime.parse("2026-05-08T09:30:10");
        System.out.println("Texto para data com horário: " + d05);

        Instant d06 = Instant.parse("2003-05-05T11:30:44-03:00");
        System.out.println("Texto para data com horário subtraindo -03:00 para igualar com o fuso brasileiro" + d06);
    }
}
