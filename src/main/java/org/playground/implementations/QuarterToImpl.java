package org.playground.implementations;

import java.time.LocalTime;
import org.playground.interfaces.SpokenTimeInterface;

public class QuarterToImpl implements SpokenTimeInterface {
  @Override
  public boolean supports(LocalTime time) {
    return time.getMinute() == 45;
  }

  @Override
  public String speakBritishTime(LocalTime time) {
    int currentHour = time.getHour();
    int nextHour = (currentHour % 12) + 1;
    return "quarter to " + TIME_INDEXES[nextHour % 12];
  }
}
