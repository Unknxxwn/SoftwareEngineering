package org.hbrs.se1.ws24.exercises.uebung3.control;

import org.hbrs.se1.ws24.exercises.uebung2.control.Container;
import org.hbrs.se1.ws24.exercises.uebung3.persistence.PersistenceStrategyStream;

public class Main {
    public static void main(String[] args) {
        Container container = Container.getInstance();

        container.setStrategy(new PersistenceStrategyStream<>());

        Client client = new Client();
        client.start();
    }
}
