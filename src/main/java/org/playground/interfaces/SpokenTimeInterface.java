package org.playground.interfaces;

import java.time.LocalTime;

public interface SpokenTimeInterface {

    String[] TIME_INDEXES = {"twelve", "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven"};

    boolean supports(LocalTime time);
    String speakBritishTime(LocalTime time);
}
