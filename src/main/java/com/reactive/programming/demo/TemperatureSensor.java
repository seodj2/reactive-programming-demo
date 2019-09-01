package com.reactive.programming.demo;

import org.springframework.stereotype.Component;
import rx.Observable;

import java.util.Random;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

@Component
public class TemperatureSensor {
    private final Random rnd = new Random();

    // TODO: add temperature observable

    private Temperature probe() {
        return new Temperature(16 + rnd.nextGaussian() * 10);
    }

    public Observable<Temperature> temperatureStream() {
        // TODO: return temperature observable
        return null;
    }
}
