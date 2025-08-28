package org.playground.implementations;

import java.time.LocalTime;
import org.playground.interfaces.SpokenTimeStrategy;
import org.playground.utils.NumbersUtil;

public class PastStrategyImpl implements SpokenTimeStrategy {
  @Override
  public boolean supports(LocalTime time) {
    int minute = time.getMinute();
    return minute > 0 && minute < 30 && minute != 15;
  }

  @Override
  public String speakBritishTime(LocalTime time) {
    return NumbersUtil.minuteInWords(time.getMinute())
        + " past "
        + NumbersUtil.hourInWords(time.getHour());
  }
}
