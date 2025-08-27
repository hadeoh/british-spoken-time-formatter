import org.junit.Test;
import org.playground.implementations.*;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BritishSpokenTimeStrategyTest {

    @Test
    public void testOClockStrategy() {
        OClockImpl impl = new OClockImpl();
        LocalTime time = LocalTime.of(3, 0);
        assertTrue(impl.supports(time));
        assertEquals("three o'clock", impl.speakBritishTime(time));
    }

    @Test
    public void testQuarterPastStrategy() {
        QuarterPastImpl impl = new QuarterPastImpl();
        LocalTime time = LocalTime.of(4, 15);
        assertTrue(impl.supports(time));
        assertEquals("quarter past four", impl.speakBritishTime(time));
    }

    @Test
    public void testHalfPastStrategy() {
        HalfPastImpl impl = new HalfPastImpl();
        LocalTime time = LocalTime.of(7, 30);
        assertTrue(impl.supports(time));
        assertEquals("half past seven", impl.speakBritishTime(time));
    }

    @Test
    public void testQuarterToStrategy() {
        QuarterToImpl impl = new QuarterToImpl();
        LocalTime time = LocalTime.of(9, 45);
        assertTrue(impl.supports(time));
        assertEquals("quarter to ten", impl.speakBritishTime(time));
    }

    @Test
    public void testPastStrategy() {
        PastImpl impl = new PastImpl();
        LocalTime time = LocalTime.of(3, 10);
        assertTrue(impl.supports(time));
        assertEquals("ten past three", impl.speakBritishTime(time));
    }

    @Test
    public void testToStrategy() {
        ToImpl impl = new ToImpl();
        LocalTime time = LocalTime.of(8, 40);
        assertTrue(impl.supports(time));
        assertEquals("twenty to nine", impl.speakBritishTime(time));
    }

    @Test
    public void testBefore35thMinuteStrategy() {
        Before35thMinuteImpl impl = new Before35thMinuteImpl();
        LocalTime time = LocalTime.of(6, 32);
        assertTrue(impl.supports(time));
        assertEquals("six thirty two", impl.speakBritishTime(time));
    }

    @Test
    public void testMidnightStrategy() {
        MidnightImpl impl = new MidnightImpl();
        LocalTime time = LocalTime.of(0, 0);
        assertTrue(impl.supports(time));
        assertEquals("midnight", impl.speakBritishTime(time));
    }

    @Test
    public void testNoonStrategy() {
        NoonImpl impl = new NoonImpl();
        LocalTime time = LocalTime.of(12, 0);
        assertTrue(impl.supports(time));
        assertEquals("noon", impl.speakBritishTime(time));
    }
}
