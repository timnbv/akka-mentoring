package com.epam.akka.ps.essembly;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import com.epam.akka.ps.essembly.actor.DirectorActor;
import com.epam.akka.ps.essembly.actor.Terminator;

/**
 * @author Tim Ryzhov
 */
public class Main {
    public static void main(String[] args) {
        ActorSystem system = ActorSystem.create("PC_Essembly_Line");
        ActorRef director = system.actorOf(Props.create(DirectorActor.class), "Director");
        system.actorOf(Props.create(Terminator.class, director), "terminator");
    }

}

