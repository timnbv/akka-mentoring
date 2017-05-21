package com.epam.akka.sample;

import akka.actor.AbstractLoggingActor;

/**
 * @author Tim Ryzhov
 */
public class MyRoutee extends AbstractLoggingActor{
    @Override
    public Receive createReceive() {

        return receiveBuilder()
                .match(SomeMessage.class, w -> {
                    SomeMessage someMessage = updateMsg(w);
                    log().info(someMessage.getAbc() + someMessage.getPayload().toString() + " Sender: " + getSender());
                    getSender().tell(someMessage, getSelf());

                })
                .build();

    }

    protected SomeMessage updateMsg(SomeMessage w) {
        return new SomeMessage(w.getPayload() + 1, w.getAbc());
    }
}
