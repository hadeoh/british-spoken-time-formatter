package org.playground.implementations;

import java.time.LocalTime;
import org.playground.interfaces.SpokenTimeStrategy;
import org.playground.utils.NumbersUtil;

public class HalfPastStrategyImpl implements SpokenTimeStrategy {
  @Override
  public boolean supports(LocalTime time) {
    return time.getMinute() == 30;
  }

  @Override
  public String speakBritishTime(LocalTime time) {
    return "half past " + NumbersUtil.hourInWords(time.getHour());
  }
}
