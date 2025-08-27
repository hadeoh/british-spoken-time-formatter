package org.playground.implementations;

import java.time.LocalTime;
import org.playground.interfaces.SpokenTimeInterface;

public class MidnightImpl implements SpokenTimeInterface {
  @Override
  public boolean supports(LocalTime time) {
    return time.getMinute() == 0 && time.getHour() == 0;
  }

  @Override
  public String speakBritishTime(LocalTime time) {
    return "midnight";
  }
}
