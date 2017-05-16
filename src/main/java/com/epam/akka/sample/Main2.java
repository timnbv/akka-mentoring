package com.epam.akka.sample;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import com.epam.akka.ps.essembly.actor.Terminator;

public class Main2 {

    public static void main(String[] args) {
        ActorSystem system = ActorSystem.create("Hello");
        ActorRef a = system.actorOf(Props.create(HelloWorld.class), "helloWorld");
        system.actorOf(Props.create(Terminator.class, a), "terminator");
    }

}

