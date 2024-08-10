package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2023-12-31");
        LocalDateTime d02 = LocalDateTime.parse("2023-12-01T18:21:39");
        Instant d03 = Instant.parse("2024-01-01T18:50:02Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        //criação de método em conformidade com o pattern escolhido, porém levando em consideração o horário local do usuário
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("Padrão ISO8601: " + d01);
        System.out.println("--------------------");
        //utilizando método format + formatação definida
        System.out.println("Formato definido: " + d01.format(fmt1));
        System.out.println("Formato definido: " + d02.format(fmt1));
        System.out.println("Formato definido com hora: " + d02.format(fmt2));
        System.out.println("--------------------");
        //utilizando DateTimeFormat e passando a data
        System.out.println("Inversão de chamada método: " + fmt1.format(d01));
        System.out.println("--------------------");
        //passando DateTimeFormatter diretamente na chamada
        System.out.println("Date Time Formatter direto: " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("--------------------");
        System.out.println("Padrão global: " + fmt3.format(d03));
        System.out.println("--------------------");
        System.out.println("Formato com Constante : " + d02.format(fmt4));
        System.out.println("--------------------");
        System.out.println("Formato com Constante Global: " + fmt5.format(d03));

    }
}
