package org.playground.implementations;

import org.playground.interfaces.SpokenTimeInterface;

import java.time.LocalTime;

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
