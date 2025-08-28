package org.playground.factories;

import java.time.LocalTime;
import java.util.List;
import org.playground.implementations.*;
import org.playground.interfaces.SpokenTimeStrategy;

public class SpokenTimeFactory {

  private final List<SpokenTimeStrategy> spokenTimeStrategies =
      List.of(
          new DigitalThirtyOneToThirtyFourStrategyImpl(),
          new NoonStrategyImpl(),
          new MidnightStrategyImpl(),
          new OClockStrategyImpl(),
          new QuarterPastStrategyImpl(),
          new HalfPastStrategyImpl(),
          new QuarterToStrategyImpl(),
          new PastStrategyImpl(),
          new ToStrategyImpl());

  public SpokenTimeStrategy computeSpokenTimeStrategy(LocalTime time) {
    return spokenTimeStrategies.stream()
        .filter(s -> s.supports(time))
        .findFirst()
        .orElseThrow(() -> new IllegalArgumentException("No strategy found for time: " + time));
  }
}
