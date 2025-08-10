package com.wipro.annonymous.test;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.function.Consumer;

public class Ex8 {
    public static void main(String[] args) {
        
        Consumer<String> TimeZone = zone -> {
            ZonedDateTime time = ZonedDateTime.now(ZoneId.of(zone));
            System.out.println("Current time in " + zone + ": " + time);
        };

        
        TimeZone.accept("Europe/London");
    }
}


