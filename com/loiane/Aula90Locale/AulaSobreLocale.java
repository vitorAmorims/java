package com.loiane.Aula90Locale;

import java.text.NumberFormat;
import java.util.Locale;

public class AulaSobreLocale {
    public static void main(String[] args) {
//        Locale locale = Locale.getDefault();
//        System.out.println(locale); //saida en_US
        Locale[] locales = Locale.getAvailableLocales();
        for(Locale locale: locales){
            System.out.println("Nome do locale: "+ locale.getDisplayName());
            System.out.println("Código lingua: "+ locale.getLanguage());
            System.out.println("Lingua oficial: " + locale.getDisplayLanguage());
            System.out.println("Nome do Pais: "+ locale.getDisplayCountry());
            System.out.println("-----------------------------------------");
        }

//        Locale.setDefault(nome_do_locale);

        Locale br = new Locale("pt", "BR");
        NumberFormat nf = NumberFormat.getCurrencyInstance(br);
        NumberFormatComLocale(nf,500000d);

        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormatComLocale(nf1,500000d);

        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.ITALY);
        NumberFormatComLocale(nf2,500000d);

    }
    public static void NumberFormatComLocale(NumberFormat nf, double valor){
        System.out.println(nf.format(valor));
    }
}
