package org.playground.implementations;

import org.playground.interfaces.SpokenTimeInterface;

import java.time.LocalTime;

public class ToImpl implements SpokenTimeInterface {
    @Override
    public boolean supports(LocalTime time) {
        int minute = time.getMinute();
        return minute > 30 && minute != 45;
    }

    @Override
    public String speakBritishTime(LocalTime time) {
        int nextHour = (time.getHour() % 12) + 1;
        return MINUTES_IN_WORDS[60 - time.getMinute()] + " to " + TIME_INDEXES[nextHour % 12];
    }
}
