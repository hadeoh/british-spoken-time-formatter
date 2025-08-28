package org.playground.implementations;

import java.time.LocalTime;
import org.playground.interfaces.SpokenTimeStrategy;
import org.playground.utils.NumbersUtil;

public class QuarterToStrategyImpl implements SpokenTimeStrategy {
  @Override
  public boolean supports(LocalTime time) {
    return time.getMinute() == 45;
  }

  @Override
  public String speakBritishTime(LocalTime time) {
    int currentHour = time.getHour();
    int nextHour = (currentHour % 12) + 1;
    return "quarter to " + NumbersUtil.hourInWords(nextHour);
  }
}
