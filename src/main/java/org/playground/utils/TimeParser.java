package org.playground.utils;

import org.playground.exceptions.InvalidTimeFormatException;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class TimeParser {

    public static LocalTime parse(String time) {
        // This is to validate the time format passed in the input e.g 11:25
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");

            return LocalTime.parse(time, formatter);
        } catch (DateTimeParseException e) {
            throw new InvalidTimeFormatException("Invalid input. Please enter time in HH:mm format (e.g., 07:35)");
        }
    }
}
