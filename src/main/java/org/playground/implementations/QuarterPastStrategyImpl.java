package org.playground.implementations;

import java.time.LocalTime;
import org.playground.interfaces.SpokenTimeStrategy;
import org.playground.utils.NumbersUtil;

public class QuarterPastStrategyImpl implements SpokenTimeStrategy {

  @Override
  public boolean supports(LocalTime time) {
    return time.getMinute() == 15;
  }

  @Override
  public String speakBritishTime(LocalTime time) {
    return "quarter past " + NumbersUtil.hourInWords(time.getHour());
  }
}
