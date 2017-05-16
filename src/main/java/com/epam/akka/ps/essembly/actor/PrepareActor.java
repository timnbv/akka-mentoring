package com.epam.akka.ps.essembly.actor;

import akka.actor.AbstractLoggingActor;
import com.epam.akka.ps.essembly.MessageType;
import com.epam.akka.ps.essembly.model.PersonalComputer;

/**
 * @author Tim Ryzhov
 */
public class PrepareActor extends AbstractLoggingActor {
    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(PersonalComputer.class, m -> {
                    log().info("I've checked all details and it's OK");
                    sender().tell(MessageType.DONE, self());
                })
                .build();
    }
}
