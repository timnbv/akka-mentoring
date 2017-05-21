package com.epam.akka.sample;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.routing.RoundRobinPool;

public class Main {

  public static void main(String[] args) {
   // akka.Main.main(new String[] { HelloWorld.class.getName() });

      ActorSystem system = ActorSystem.create("PCFactory");

      ActorRef router = system.actorOf(new RoundRobinPool(4).props(Props.create(SimpleRouter.class)), "router");
      router.tell(new SomeMessage(0,""), router);
    }
  }

