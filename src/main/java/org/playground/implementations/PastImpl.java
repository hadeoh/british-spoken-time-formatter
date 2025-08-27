package org.playground.implementations;

import org.playground.interfaces.SpokenTimeInterface;

import java.time.LocalTime;

public class PastImpl implements SpokenTimeInterface {
    @Override
    public boolean supports(LocalTime time) {
        int minute = time.getMinute();
        return minute > 0 && minute < 30 && minute != 15;
    }

    @Override
    public String speakBritishTime(LocalTime time) {
        return time.getMinute() + " past " + TIME_INDEXES[time.getHour() % 12];
    }
}
