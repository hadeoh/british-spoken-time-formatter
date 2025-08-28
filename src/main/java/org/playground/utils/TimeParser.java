package org.playground.utils;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import org.playground.exceptions.InvalidTimeFormatException;

public class TimeParser {

  private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");

  public static LocalTime parse(String time) {
    try {
      return LocalTime.parse(time, formatter);
    } catch (DateTimeParseException e) {
      throw new InvalidTimeFormatException(
          "Invalid input. Please enter time in H:mm format (e.g., 7:35 or 07:35)");
    }
  }
}
