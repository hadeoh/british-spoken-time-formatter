package org.playground.implementations;

import java.time.LocalTime;
import org.playground.interfaces.SpokenTimeStrategy;
import org.playground.utils.NumbersUtil;

public class OClockStrategyImpl implements SpokenTimeStrategy {

  @Override
  public boolean supports(LocalTime time) {
    return time.getMinute() == 0 && time.getHour() != 0 && time.getHour() != 12;
  }

  @Override
  public String speakBritishTime(LocalTime time) {
    return NumbersUtil.hourInWords(time.getHour()) + " o'clock";
  }
}
