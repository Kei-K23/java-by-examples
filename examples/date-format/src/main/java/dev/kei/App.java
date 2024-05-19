package dev.kei;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App
{
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main( String[] args )
    {
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println(currentTime.format(DATE_TIME_FORMATTER));
    }
}
