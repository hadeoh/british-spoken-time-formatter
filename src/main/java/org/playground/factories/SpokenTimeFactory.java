package org.playground.factories;

import org.playground.implementations.*;
import org.playground.interfaces.SpokenTimeInterface;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class SpokenTimeFactory {

    private final List<SpokenTimeInterface> spokenTimeStrategies = new ArrayList<>();

    public SpokenTimeFactory() {
        // Order matters! Most specific → least specific
        spokenTimeStrategies.add(new Before35thMinuteImpl());
        spokenTimeStrategies.add(new NoonImpl());
        spokenTimeStrategies.add(new MidnightImpl());
        spokenTimeStrategies.add(new OClockImpl());
        spokenTimeStrategies.add(new QuarterPastImpl());
        spokenTimeStrategies.add(new HalfPastImpl());
        spokenTimeStrategies.add(new QuarterToImpl());
        spokenTimeStrategies.add(new PastImpl());
        spokenTimeStrategies.add(new ToImpl());
    }

    public SpokenTimeInterface computeSpokenTimeStrategy(LocalTime time) {
        return spokenTimeStrategies.stream().filter(s -> s.supports(time)).findFirst().orElseThrow(() ->
                new IllegalArgumentException("No strategy found for time: " + time));
    }
}
