import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.playground.BritishSpokenTimeFormatter;
import org.playground.exceptions.InvalidTimeFormatException;

public class BritishSpokenTimeFormatterTest {

  BritishSpokenTimeFormatter britishSpokenTimeFormatter;

  @Before
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

  @Test(expected = InvalidTimeFormatException.class)
  public void testBritishSpokenTimeForInvalidTime() {
    britishSpokenTimeFormatter.toBritishSpokenTime("7:61");
  }
}
