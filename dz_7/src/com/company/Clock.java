package com.company;

//import java.util.concurrent.TimeUnit;

public class Clock {


    void convertTime(int s){
        int SS = s%60;
        int HH = s/60; //
        int MM = HH%60;
        HH /= 60;
        //int HH = (int) TimeUnit.SECONDS.toHours(s);
        //int MM = (int) (TimeUnit.SECONDS.toMinutes(s) - (TimeUnit.SECONDS.toHours(s)* 60));
        //int SS = (int) (TimeUnit.SECONDS.toSeconds(s) - (TimeUnit.SECONDS.toMinutes(s) *60));
        System.out.println(HH+":"+MM+":"+SS);
    }

}
