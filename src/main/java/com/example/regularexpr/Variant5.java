package com.example.regularexpr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Variant5 {
    public void GetSovpadenie() {
    String string = "ДСФ ДСДС ОШМ 123456";
    Pattern p = Pattern.compile("ДСФ");
    Matcher m = p.matcher(string);
        if(m.find())

    {
        System.out.println("Есть совпадения " + m.group());  // group() возвращает строку
        System.out.println();
    }
        else

    {
        System.out.println("Нет совпадений");
    }
}
}

