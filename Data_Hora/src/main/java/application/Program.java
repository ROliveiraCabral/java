package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // data e hora local - padrão ISO
        LocalDate d01 = LocalDate.now();
        System.out.println("data atual: " + d01);

        LocalDateTime d02 = LocalDateTime.now();
        System.out.println("data e hora atual: " + d02);

        // data e hora global - GMT / UTC - horário Londres
        Instant d03 = Instant.now();
        System.out.println("data e hora atual - GMT: " + d03);

        // gerar um objeto a partir de uma string
        LocalDate d04 = LocalDate.parse("2024-02-17");
        System.out.println("objeto data: " + d04);

        LocalDateTime d05 = LocalDateTime.parse("2024-02-17T17:16:35");
        System.out.println("objeto data time: " + d05);

        Instant d06 = Instant.parse("2024-02-17T17:16:35Z");
        System.out.println("objeto data time: " + d06);

        Instant d07 = Instant.parse("2024-02-17T17:16:35-03:00");
        System.out.println("objeto data time: " + d07);

        // data em outros formatos
        LocalDate d08 = LocalDate.parse("31/01/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("data padrão ISO: " + d08);

        LocalDateTime d09 = LocalDateTime.parse("31/01/2024 01:30", fmt2);
        System.out.println("data hora padrão ISO: " + d09);

        // instanciar data e hora a partir de dados isolados
        LocalDate d10 = LocalDate.of(2023, 12, 31);
        System.out.println("data a partir de dados isolados: " + d10);

        LocalDateTime d11 = LocalDateTime.of(2023, 12, 31, 18, 15);
        System.out.println("data e hora a partir de dados isolados: " + d11);

    }
}
