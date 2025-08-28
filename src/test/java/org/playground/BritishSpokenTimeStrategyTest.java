package org.playground;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalTime;
import org.junit.jupiter.api.Test;
import org.playground.implementations.*;

public class BritishSpokenTimeStrategyTest {

  @Test
  public void testOClockStrategy() {
    OClockStrategyImpl impl = new OClockStrategyImpl();
    LocalTime time = LocalTime.of(3, 0);
    assertTrue(impl.supports(time));
    assertEquals("three o'clock", impl.speakBritishTime(time));
  }

  @Test
  public void testQuarterPastStrategy() {
    QuarterPastStrategyImpl impl = new QuarterPastStrategyImpl();
    LocalTime time = LocalTime.of(4, 15);
    assertTrue(impl.supports(time));
    assertEquals("quarter past four", impl.speakBritishTime(time));
  }

  @Test
  public void testHalfPastStrategy() {
    HalfPastStrategyImpl impl = new HalfPastStrategyImpl();
    LocalTime time = LocalTime.of(7, 30);
    assertTrue(impl.supports(time));
    assertEquals("half past seven", impl.speakBritishTime(time));
  }

  @Test
  public void testQuarterToStrategy() {
    QuarterToStrategyImpl impl = new QuarterToStrategyImpl();
    LocalTime time = LocalTime.of(9, 45);
    assertTrue(impl.supports(time));
    assertEquals("quarter to ten", impl.speakBritishTime(time));
  }

  @Test
  public void testPastStrategy() {
    PastStrategyImpl impl = new PastStrategyImpl();
    LocalTime time = LocalTime.of(3, 10);
    assertTrue(impl.supports(time));
    assertEquals("ten past three", impl.speakBritishTime(time));
  }

  @Test
  public void testToStrategy() {
    ToStrategyImpl impl = new ToStrategyImpl();
    LocalTime time = LocalTime.of(8, 40);
    assertTrue(impl.supports(time));
    assertEquals("twenty to nine", impl.speakBritishTime(time));
  }

  @Test
  public void testBefore35thMinuteStrategy() {
    DigitalThirtyOneToThirtyFourStrategyImpl impl = new DigitalThirtyOneToThirtyFourStrategyImpl();
    LocalTime time = LocalTime.of(6, 32);
    assertTrue(impl.supports(time));
    assertEquals("six thirty two", impl.speakBritishTime(time));
  }

  @Test
  public void testMidnightStrategy() {
    MidnightStrategyImpl impl = new MidnightStrategyImpl();
    LocalTime time = LocalTime.of(0, 0);
    assertTrue(impl.supports(time));
    assertEquals("midnight", impl.speakBritishTime(time));
  }

  @Test
  public void testNoonStrategy() {
    NoonStrategyImpl impl = new NoonStrategyImpl();
    LocalTime time = LocalTime.of(12, 0);
    assertTrue(impl.supports(time));
    assertEquals("noon", impl.speakBritishTime(time));
  }
}
