package org.playground.utils;

import org.playground.exceptions.InvalidTimeFormatException;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class TimeParser {

    public static LocalTime parse(String time) {
        // This is to validate the time format passed in the input e.g 11:25
        try {
//            if (!time.matches("(^(?:[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$)?")) {
//                throw new InvalidTimeFormatException("Time must be in HH:mm format: " + time);
//            }

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");

            return LocalTime.parse(time, formatter);
        } catch (DateTimeParseException e) {
            throw new InvalidTimeFormatException("Invalid input. Please enter time in HH:mm format (e.g., 07:35)");
        }
    }
}
