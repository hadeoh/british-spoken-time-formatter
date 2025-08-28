package org.playground.interfaces;

import java.time.LocalTime;

public interface SpokenTimeStrategy {

  boolean supports(LocalTime time);

  String speakBritishTime(LocalTime time);
}
