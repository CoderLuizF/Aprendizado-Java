package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program8 {

    public static void main(String[] args) {

        //Objeto de formatação de data (ESTUDAR SOBRE)
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

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

        LocalDate d08 = LocalDate.parse("02/05/2001", fmt1);
        System.out.println("Data personalizada: " + d08);

        //CONVERTENDO DATA-HORA PARA TEXTO
        //Usando o d04, d05 e d06 para converter

        System.out.println("forma 1: d04 usando o método format = " + d04.format(fmt1));
        System.out.println("forma 2: d04 usando o método format = " + fmt1.format(d04));
    }
}
