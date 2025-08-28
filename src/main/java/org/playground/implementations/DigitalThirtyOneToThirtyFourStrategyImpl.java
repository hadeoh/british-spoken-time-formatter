package org.playground.implementations;

import java.time.LocalTime;
import org.playground.interfaces.SpokenTimeStrategy;
import org.playground.utils.NumbersUtil;

public class DigitalThirtyOneToThirtyFourStrategyImpl implements SpokenTimeStrategy {

  @Override
  public boolean supports(LocalTime time) {
    // Covers cases that are before 35th minute
    int minute = time.getMinute();
    return minute >= 31 && minute <= 34;
  }

  @Override
  public String speakBritishTime(LocalTime time) {
    return NumbersUtil.hourInWords(time.getHour())
        + " "
        + NumbersUtil.minuteInWords(time.getMinute());
  }
}
