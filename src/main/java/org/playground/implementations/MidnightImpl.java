package org.playground.implementations;

import org.playground.interfaces.SpokenTimeInterface;

import java.time.LocalTime;

public class MidnightImpl implements SpokenTimeInterface {
    @Override
    public boolean supports(LocalTime time) {
        return time.getMinute() == 0 && time.getHour() == 0;
    }

    @Override
    public String speakBritishTime(LocalTime time) {
        return "midnight";
    }
}
