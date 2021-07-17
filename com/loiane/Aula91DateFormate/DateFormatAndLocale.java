package com.loiane.Aula91DateFormate;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateFormatAndLocale {
    public static void main(String[] args) {
        Date hoje = new Date();
        System.out.println(hoje);

//        setando Locale para EUA
        System.out.println("padrão americano");
        Locale.setDefault(new Locale("en", "US"));

        String hojeFormatado = DateFormat.getInstance().format(hoje);
        System.out.println(hojeFormatado);
        hojeFormatado = DateFormat.getTimeInstance().format(hoje);
        System.out.println(hojeFormatado);
        hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
        System.out.println(hojeFormatado);

//        setando Locale para Brazil
        System.out.println("padrão Brasileiro");
        Locale.setDefault(new Locale("pt", "Brazil"));

        hojeFormatado = DateFormat.getInstance().format(hoje);
        System.out.println(hojeFormatado);
        hojeFormatado = DateFormat.getTimeInstance().format(hoje);
        System.out.println(hojeFormatado);
        hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
        System.out.println(hojeFormatado);

        System.out.println(Locale.getDefault());

//        formatando String para Date com Datefprmat
        String data = "12/02/2017 14:05";
        try {
            Date dataDate = DateFormat.getInstance().parse(data);
            System.out.println(dataDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

//        formatando String para Date com Calendar
        Calendar calendario = Calendar.getInstance();
        try {
            calendario.setTime(DateFormat.getDateInstance().parse(data));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(calendario.get(Calendar.YEAR));
    }
}
