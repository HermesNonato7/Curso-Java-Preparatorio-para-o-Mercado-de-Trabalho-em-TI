package org.example.exemplos;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class ManipulandoData {

    public static void main(String[] args) {
    /*
        Date representa um instante no tempo, esta classe armazena internamente um número em milisegundos
        desde a meia noite do dia 01/01/1970 no horário UTC ou timezone GMT (Greenwich Mean Time (time zone))
        onde ficou definido por convenção, a base para cálculo internacional de horário.
        UTC é um padrão: Coordinated Universal Time (time standard)
        O Brasil tem um time zone de -3 (fuso horário)
   */
        Date date = new Date();
        System.out.println("A data atual é " + date);

        date = new Date(System.currentTimeMillis());//Inserido como parámetro um long representando um instante no tempo.
        System.out.println("A data atual é " + date);

        //Deprecated
        date = new Date(2022, 05, 30, 11, 20, 05);
        System.out.println("Uma data e hora específica: " + date);

    /*
           Padrão ISO 8601 para armazenar datas em forma de texto
           formato: yyyy-MM-ddTHH:mm:ssZ
           o Z indica que é um horÃ¡rio UTC ou seja o horário de Greenwich

           Obs.: É uma boa prática armazenar no horário UTC e quando for utilizar converte para o horário local.
    */
        date = Date.from(Instant.parse("2022-05-30T11:20:05Z"));
        System.out.println("Uma data e hora específica em Greenwich " + date);

        //Define formatos para conversão entre Date e String
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Data formatada: " + sdf.format(date));

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
        System.out.println("Data e hora formatada: " + sdf2.format(date));

        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println("Data e hora formatada em Greenwich: " + sdf3.format(date));
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT-3"));
        System.out.println("Data e hora formatada no Brasil: " + sdf3.format(date));

        //Manipulando data com Calendar----------------------------------------------------------------------

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);

        calendar.add(Calendar.DAY_OF_MONTH, 1);//adicionei 1 mÃªs
        date = calendar.getTime();

        calendar2.add(Calendar.YEAR, -2);//removi 2 anos
        Date date2 = calendar2.getTime();

        System.out.println("Adicionado um mês na data = " + sdf3.format(date));
        System.out.println("Removido 2 anos da data = " + sdf3.format(date2));

        System.out.println("Calendar tem uma data anterior a de Calendar2 ? R: " + calendar.before(calendar2));
        System.out.println("Calendar tem uma data posterior a de Calendar2 ? R: " + calendar.after(calendar2));

        System.out.println("Primeiro dia do mês " + calendar.getMinimum(Calendar.DAY_OF_MONTH));
        System.out.println("Último dia do mês " + calendar.getMaximum(Calendar.DAY_OF_MONTH));

        long tempo1 = calendar.getTimeInMillis();
        System.out.println("Tempo representado em long " + tempo1);

        long tempo2 = calendar2.getTimeInMillis();
        System.out.println("Tempo representado em long " + tempo2);

        //LocalDate - LocalDateTime - LocalTime a partir do Java 8
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalTime localTime = LocalTime.now();

        //Formatando
        String strLocalDate = localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String strLocalDateTime = localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        String strLocalTime = localTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        System.out.println("Data formatada " + strLocalDate);
        System.out.println("Data e hora formatada " + strLocalDateTime);
        System.out.println("Hora formatada " + strLocalTime);

        //Adicionando dias - meses - horas - anos
        LocalDate localDate3 = localDate.plusMonths(1).plusDays(1).plusYears(1);//a ordem afeta o resultado
        LocalDate localDate4 = localDate.plusDays(1).plusMonths(1).plusYears(1);
        System.out.println("Nova data: " + localDate3);
        System.out.println("Nova data: " + localDate4);

        LocalDateTime localDateTime3 = localDateTime.plusDays(1).plusMonths(1).plusHours(2);
        System.out.println("Adicionado 1 dia, 1 mês e 2 horas: " + localDateTime3);

        //Subtraindo data
        LocalDate localDate5 = localDate.minusDays(1);
        LocalDateTime localDateTime4 = localDateTime.minusDays(1).minusMonths(1).minusHours(2);
        LocalTime localTime4 = localTime.minusHours(1);

        //Criando objetos especÃ­fico
        LocalDate localDate6 = LocalDate.of(2011, 07, 22);
        LocalDateTime localDateTime5 = LocalDateTime.of(2011, 07, 11, 10, 45, 30);
        LocalTime localTime5 = LocalTime.of(10, 35, 12);

        System.out.println("Uma data específica com LocalDate: " + localDate6);

        //Realizando parse de String em Datas
        LocalDate localDate7 = LocalDate.parse("2012-07-22", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDateTime localDateTime6 = LocalDateTime.parse("2012-07-22 10:40:11", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        LocalTime localTime6 = LocalTime.parse("11:45:12", DateTimeFormatter.ofPattern("HH:mm:ss"));

        //Recuperando partes especificas de um objeto
        int ano = localDate.getYear();
        System.out.println("Ano " + ano);
        int hora = localTime.getHour();
        System.out.println("Ano " + hora);

        Month mes = localDateTime.getMonth();
        System.out.println("Último dia do mês " + mes.maxLength());
        System.out.println("Nome do mês " + mes.name());

        //Comparando com os métodos isAfter, isBefore e isEqual
        LocalDate localDate8 = LocalDate.now();
        LocalDate localDate9 = LocalDate.now().minusDays(1);

        boolean vemDepois = localDate8.isAfter(localDate9);   //true
        boolean vemAntes = localDate8.isBefore(localDate9); //false
        boolean eIgual = localDate8.isEqual(localDate9); //false

        //Capturando Diferenças entre datas com classe Period
        LocalDate localDate10 = LocalDate.now();
        LocalDate localDate11 = LocalDate.now().plusDays(2);

        Period period1 = Period.between(localDate10, localDate11);
        System.out.println("Período em dias de duas datas: " + period1.getDays());

        //Capturando Diferenças com a Enum ChronoUnit
        //A Enum ChronoUnit é utilizada para manipular Tempos
        LocalDateTime localDateTime12 = LocalDateTime.now();
        LocalDateTime localDateTime13 = LocalDateTime.now().plusDays(2);

        long periodAsMinutes = ChronoUnit.MINUTES.between(localDateTime12, localDateTime13);
        long periodAsHours = ChronoUnit.HOURS.between(localDateTime12, localDateTime13);
        long periodAsDays = ChronoUnit.DAYS.between(localDateTime12, localDateTime13);

        System.out.println("Período em minutos de duas datas: " + periodAsMinutes);
        System.out.println("Período em horas de duas datas: " + periodAsHours);
        System.out.println("Período em dias de duas datas: " + periodAsDays);
    }
}

