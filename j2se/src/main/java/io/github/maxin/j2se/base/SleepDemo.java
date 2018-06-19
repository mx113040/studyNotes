package io.github.maxin.j2se.base;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SleepDemo {
    public static void main(String[] args) {
        Date dNow=new Date();
        SimpleDateFormat ft=new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        try {
            System.out.println("Current Date: "+ft.format(dNow));
            Thread.sleep(1000*3);
            dNow=new Date();
            System.out.println("Current Date: "+ft.format(dNow));

        } catch (Exception e){
            System.out.println("Got an exception");
        }
    }
}
