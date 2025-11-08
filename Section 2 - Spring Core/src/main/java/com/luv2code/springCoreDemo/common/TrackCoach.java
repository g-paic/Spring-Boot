package com.luv2code.springCoreDemo.common;

import org.springframework.stereotype.Component;

@Component
// @Primary
// @Lazy
public class TrackCoach implements Coach {

    public TrackCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }
}
