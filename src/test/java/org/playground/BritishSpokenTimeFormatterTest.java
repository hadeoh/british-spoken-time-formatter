package org.playground;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.playground.exceptions.InvalidTimeFormatException;

public class BritishSpokenTimeFormatterTest {

  BritishSpokenTimeFormatter britishSpokenTimeFormatter;

  @BeforeEach
  public void setup() {
    britishSpokenTimeFormatter = new BritishSpokenTimeFormatter();
  }

  @Test
  public void testBritishSpokenTimeWithDoubleHours() {
    var result = britishSpokenTimeFormatter.toBritishSpokenTime("01:00");
    assertEquals("one o'clock", result);
  }

  @Test
  public void testBritishSpokenTimeWithSingleHours() {
    var result = britishSpokenTimeFormatter.toBritishSpokenTime("7:35");
    assertEquals("twenty five to eight", result);
  }

  @Test
  public void testBritishSpokenTimeAtHalfMinute() {
    var result = britishSpokenTimeFormatter.toBritishSpokenTime("7:30");
    assertEquals("half past seven", result);
  }

  @Test
  public void testBritishSpokenTimeAtNoon() {
    var result = britishSpokenTimeFormatter.toBritishSpokenTime("12:00");
    assertEquals("noon", result);
  }

  @Test
  public void testBritishSpokenTimeForInvalidTime() {
    assertThrows(
        InvalidTimeFormatException.class,
        () -> britishSpokenTimeFormatter.toBritishSpokenTime("7:61"));
  }

  @ParameterizedTest
  @CsvSource({
    "03:01,one past three",
    "03:10,ten past three",
    "04:15,quarter past four",
    "07:30,half past seven",
    "09:45,quarter to ten",
    "07:35,twenty five to eight",
    "06:32,six thirty two",
    "00:00,midnight",
    "12:00,noon"
  })
  public void testE2E(String input, String expected) {
    assertEquals(expected, britishSpokenTimeFormatter.toBritishSpokenTime(input));
  }
}
