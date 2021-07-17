package com.loiane.Aula92TimeZone;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Aula92TimeZone {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        TimeZone tz = calendario.getTimeZone();
        System.out.println(tz);

        TimeZone tz1 = TimeZone.getDefault();
        System.out.println(tz1);

//        String[] fusos = TimeZone.getAvailableIDs();
//        for(String fuso: fusos){
//            System.out.println(fuso);
//        }
        TimeZone tzSP = TimeZone.getTimeZone("America/Sao_Paulo");
        System.out.println(tzSP.getDisplayName());
        System.out.println(tzSP.getID());

        Calendar agora = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyy hh:mm:ss a z");
        System.out.println(sdf.format(agora.getTime()));

        Calendar agoraSP = Calendar.getInstance(tzSP);
        System.out.println(sdf.format(agoraSP.getTime()));

        agoraSP.add(Calendar.HOUR_OF_DAY, tzSP.getOffset((System.currentTimeMillis()) * -1) / 1000 / 60 / 60);
        System.out.println(sdf.format(agoraSP.getTime()));

    }
}
