package org.playground.implementations;

import org.playground.interfaces.SpokenTimeInterface;

import java.time.LocalTime;

public class QuarterPastImpl implements SpokenTimeInterface {

    @Override
    public boolean supports(LocalTime time) {
        return time.getMinute() == 15;
    }

    @Override
    public String speakBritishTime(LocalTime time) {
        return "quarter past " + TIME_INDEXES[time.getHour() % 12];
    }
}
