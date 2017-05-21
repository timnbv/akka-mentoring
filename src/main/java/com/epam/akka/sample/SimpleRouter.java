package com.epam.akka.sample;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.routing.ActorRefRoutee;
import akka.routing.RoundRobinRoutingLogic;
import akka.routing.Routee;
import akka.routing.Router;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Tim Ryzhov
 */
public class SimpleRouter extends AbstractActor {

    private Router router;

    @Override public void preStart() {
        List<Routee> routees = new ArrayList<>();
        List<ActorRef> actorRefs = Arrays.asList(
                getContext().actorOf(Props.create(MyRoutee.class), "A"),
                getContext().actorOf(Props.create(MyRoutee.class), "B"),
                getContext().actorOf(Props.create(MyRoutee.class), "C"),
                getContext().actorOf(Props.create(Done.class), "Done"));
        for (ActorRef actorRef : actorRefs) {
            getContext().watch(actorRef);
            routees.add(new ActorRefRoutee(actorRef));
        }
        router = new Router(new RoundRobinRoutingLogic(), routees);
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(SomeMessage.class, message -> {
                    router.route(message, getSender());
                })
                .build();
    }
}
