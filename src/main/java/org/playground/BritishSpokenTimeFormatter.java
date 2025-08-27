package org.playground;

import java.time.LocalTime;
import org.playground.factories.SpokenTimeFactory;
import org.playground.utils.TimeParser;

public class BritishSpokenTimeFormatter {

  private final SpokenTimeFactory spokenTimeFactory = new SpokenTimeFactory();

  public String toBritishSpokenTime(String time) {
    // For special cases like midnight and noon
    LocalTime localTime = TimeParser.parse(time);
    return spokenTimeFactory.computeSpokenTimeStrategy(localTime).speakBritishTime(localTime);
  }
}
