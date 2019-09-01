package com.reactive.programming.demo;

import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import rx.Subscriber;

import java.io.IOException;

public class RxSseEmitter extends SseEmitter {
    static final long SSE_SESSION_TIMEOUT = 30 * 60 * 1000L;
    private final Subscriber<Temperature> subscriber;

    RxSseEmitter() {
        super(SSE_SESSION_TIMEOUT);

        // TODO: add subscriber
    }

    Subscriber<Temperature> getSubscriber() {
        return subscriber;
    }

}
