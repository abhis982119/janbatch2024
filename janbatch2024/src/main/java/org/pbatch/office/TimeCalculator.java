package org.pbatch.office;

import java.time.LocalTime;

public class TimeCalculator {

    public static void main(String[] args) {
        System.out.println(convertToMilliseconds("10:00"));
    }

    private static long convertToMilliseconds(String timeString) {
        LocalTime time = LocalTime.parse(timeString);
        long milliseconds = time.getHour() * 3600 * 1000 +
                time.getMinute() * 60 * 1000;
        return milliseconds;
    }
}
