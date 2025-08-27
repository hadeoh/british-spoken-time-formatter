package org.playground.implementations;

import java.time.LocalTime;
import org.playground.interfaces.SpokenTimeInterface;

public class NoonImpl implements SpokenTimeInterface {
  @Override
  public boolean supports(LocalTime time) {
    return time.getMinute() == 0 && time.getHour() == 12;
  }

  @Override
  public String speakBritishTime(LocalTime time) {
    return "noon";
  }
}
