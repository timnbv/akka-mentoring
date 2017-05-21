package com.epam.akka.sample;

/**
 * @author Tim Ryzhov
 */
public class A extends MyRoutee {
    @Override
    protected SomeMessage updateMsg(SomeMessage w) {
        return new SomeMessage(w.getPayload() + 1, w.getAbc() + "A");
    }
}
