package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Program {
    public static void main(String[] args) throws ParseException {
        System.out.println("xxxxxxxxx-DATE-xxxxxxxxx");

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date y1 = sdf1.parse("24/02/2024");
        Date y2 = sdf2.parse("24/02/2024 14:47:17");
        Date y3 = Date.from(Instant.parse("2024-02-24T14:47:17Z"));

        //imprime no padrão java
        System.out.println("y1 = " + y1);
        System.out.println("y2 = " + y2);
        //imprime no formato especificado
        System.out.println("y1 = " + sdf1.format(y1));
        System.out.println("y2 = " + sdf2.format(y2));
        System.out.println("--------------------");
        //imprime no padrão ISO 8601
        System.out.println("y3 = " + y3);
        System.out.println("y3 = " + sdf2.format(y3));
        System.out.println("--------------------");

        //Instanciar data atual
        Date x1 = new Date();
        System.out.println(x1);
        System.out.println("x1 = " + sdf2.format(x1));
        Date x2 = new Date(System.currentTimeMillis());
        System.out.println(x2);
        System.out.println("x2 = " + sdf2.format(x2));
        System.out.println("--------------------");
        //data de inicio da api em milesegundos
        Date x3 = new Date(0L);
        System.out.println(x3);
        System.out.println("x3 = " + sdf2.format(x3));
        Date x4 = new Date(1000L * 60L * 60L * 5L);
        System.out.println(x4);
        System.out.println("x4 = " + sdf2.format(x4));
        System.out.println("x-----x-----x-----x-----x");
        // formatação time-zone GMT
        System.out.println("y1 = " + sdf3.format(y1));
        System.out.println("y2 = " + sdf3.format(y2));
        System.out.println("y3 = " + sdf3.format(y3));
        System.out.println("x1 = " + sdf3.format(x1));
        System.out.println("x2 = " + sdf3.format(x2));
        System.out.println("x3 = " + sdf3.format(x3));
        System.out.println("x4 = " + sdf3.format(x4));

        System.out.println();
        System.out.println("xxxxxxxxx-CALENDAR-xxxxxxxxx");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2024-02-24T14:47:17Z"));
        System.out.println(sdf.format(d));

        //instanciação e inserção da data no objeto calendar para manipulação de dados
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.add(Calendar.HOUR, 4);
        // inserção de dados no objeto Date d
        d = calendar.getTime();
        System.out.println(sdf.format(d));
        System.out.println("--------------------");
        //pegar um trecho da data
        int minutes = calendar.get(Calendar.MINUTE);
        System.out.println("Minutes = " + minutes);
        int month = 1 + calendar.get(Calendar.MONTH);
        System.out.println("Month = " + month);

    }
}