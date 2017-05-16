package com.epam.akka.ps.essembly.actor;

import akka.actor.AbstractLoggingActor;
import akka.actor.ActorRef;
import akka.actor.Props;
import com.epam.akka.ps.essembly.MessageType;
import com.epam.akka.ps.essembly.model.PersonalComputer;

/**
 * @author Tim Ryzhov
 */
public class DirectorActor extends AbstractLoggingActor{
    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .matchEquals(MessageType.DONE, m -> {
                    getContext().stop(self());
                })
                .build();
    }

    @Override
    public void preStart() {
        // create the greeter actor
        final ActorRef prepareActor = getContext().actorOf(Props.create(PrepareActor.class), "Preparation");
        // tell it to perform the greeting
        prepareActor.tell(new PersonalComputer(), self());
    }

}
