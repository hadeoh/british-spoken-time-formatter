package org.playground.implementations;

import java.time.LocalTime;
import org.playground.interfaces.SpokenTimeInterface;

public class PastImpl implements SpokenTimeInterface {
  @Override
  public boolean supports(LocalTime time) {
    int minute = time.getMinute();
    return minute > 0 && minute < 30 && minute != 15;
  }

  @Override
  public String speakBritishTime(LocalTime time) {
    return MINUTES_IN_WORDS[time.getMinute()] + " past " + TIME_INDEXES[time.getHour() % 12];
  }
}
