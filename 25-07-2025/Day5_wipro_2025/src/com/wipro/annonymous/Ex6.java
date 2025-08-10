package com.wipro.annonymous;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.function.Supplier;

public class Ex6 {
    public Supplier<String> getTomorrowsDay = () -> {
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        return tomorrow.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    };
}

