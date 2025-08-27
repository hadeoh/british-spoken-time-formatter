package org.playground.implementations;

import java.time.LocalTime;
import org.playground.interfaces.SpokenTimeInterface;

public class HalfPastImpl implements SpokenTimeInterface {
  @Override
  public boolean supports(LocalTime time) {
    return time.getMinute() == 30;
  }

  @Override
  public String speakBritishTime(LocalTime time) {
    return "half past " + TIME_INDEXES[time.getHour() % 12];
  }
}
