package org.playground.implementations;

import java.time.LocalTime;
import org.playground.interfaces.SpokenTimeStrategy;
import org.playground.utils.NumbersUtil;

public class ToStrategyImpl implements SpokenTimeStrategy {
  @Override
  public boolean supports(LocalTime time) {
    int minute = time.getMinute();
    return minute >= 35 && minute != 45;
  }

  @Override
  public String speakBritishTime(LocalTime time) {
    int nextHour = (time.getHour() % 12) + 1;
    return NumbersUtil.minuteInWords(60 - time.getMinute())
        + " to "
        + NumbersUtil.hourInWords(nextHour);
  }
}
