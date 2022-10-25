package com.example.regularexpr;

import javafx.print.PageRange;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Time {
    public void findTime(){
        String vremya = "Завтрак в 09:00. Завтрак на Плутоне в 35:69";
        Pattern p = Pattern.compile("2[0-3]|[0-1]\\d:[0-5]\\d");
        Matcher m = p.matcher(vremya);
//        if(m.find()){
//            System.out.println("Завтрак в " + m.group());
//        }else {
//            System.out.print("Время завтрака не найдено");
//        }
        while (m.find()){
            System.out.print("Завтрак в " + m.group());
            System.out.println();
        }

    }
}
