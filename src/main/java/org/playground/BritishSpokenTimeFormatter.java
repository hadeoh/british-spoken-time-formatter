package org.playground;

import org.playground.factories.SpokenTimeFactory;
import org.playground.utils.TimeParser;

import java.time.LocalTime;

public class BritishSpokenTimeFormatter {

    private final SpokenTimeFactory spokenTimeFactory = new SpokenTimeFactory();

    public String toBritishSpokenTime(String time) {
        // For special cases like midnight and noon
        LocalTime localTime = TimeParser.parse(time);
        return spokenTimeFactory.computeSpokenTimeStrategy(localTime).speakBritishTime(localTime);
    }
}
