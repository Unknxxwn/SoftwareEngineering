package org.hbrs.se1.ws24.exercises.uebung4.control;

import org.hbrs.se1.ws24.exercises.uebung2.control.Container;
import org.hbrs.se1.ws24.exercises.uebung2.control.Member;
import org.hbrs.se1.ws24.exercises.uebung3.persistence.PersistenceStrategy;
import org.hbrs.se1.ws24.exercises.uebung3.persistence.PersistenceStrategyStream;

public class Main {
    public static void main(String[] args) {
        PersistenceStrategy<Member> pStrategy = new PersistenceStrategyStream<Member>();
        Container container = Container.getInstance();
        container.setStrategy(pStrategy);
    }
}
