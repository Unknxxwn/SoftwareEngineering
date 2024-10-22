package test.org.hbrs.se1.ws24.tests.uebung3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.hbrs.se1.ws24.exercises.uebung2.control.ConcreteMember;
import org.hbrs.se1.ws24.exercises.uebung2.control.Container;
import org.hbrs.se1.ws24.exercises.uebung2.control.ContainerException;
import org.hbrs.se1.ws24.exercises.uebung2.control.Member;
import org.hbrs.se1.ws24.exercises.uebung3.persistence.PersistenceException;
import org.hbrs.se1.ws24.exercises.uebung3.persistence.PersistenceStrategyMongoDB;
import org.hbrs.se1.ws24.exercises.uebung3.persistence.PersistenceStrategyStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContainerTest {

    Container container;

    @BeforeEach
    public void setup() {
        container = Container.getInstance();
    }

    @Test
    public void testNoStrategySet() {
        try {
            container.setStrategy(null);
            container.store();
        } catch (PersistenceException e) {
            assertEquals(e.getMessage(), "Strategie nicht gesetzt!");
            assertEquals(PersistenceException.ExceptionType.NoStrategyIsSet,
                    e.getExceptionTypeType());
        }
    }

    @Test
    public void testMongoPersistence() {
        try {
            container.setStrategy(new PersistenceStrategyMongoDB<Member>());
            container.store();
        } catch (PersistenceException e) {
            assertEquals(e.getMessage(), "Strategie nicht implementiert!");
            assertEquals(e.getExceptionTypeType(), PersistenceException.ExceptionType.ImplementationNotAvailable);
        }
    }

    @Test
    public void testInvalidLocation() {
        PersistenceStrategyStream<Member> strategyStream = new PersistenceStrategyStream<Member>();
        try {
            strategyStream.setLocation("D:/Java/SoftwareEngineering/SoftwareEngineering/test");
            container.setStrategy(strategyStream);
            container.store();
        } catch (PersistenceException e) {
            assertEquals(e.getMessage(), "Fehler beim Speichern der Datei");
            assertEquals(PersistenceException.ExceptionType.SavingFailed,
                    e.getExceptionTypeType());
        }

    }

    @Test
    public void testRoundTrip() {
        try {

            container.setStrategy(new PersistenceStrategyStream<>());

            container.addMember(new ConcreteMember(1));
            assertEquals(1, container.size());

            container.store();

            container.deleteMember(1);
            assertEquals(0, container.size());

            container.load();
            assertEquals(1, container.size());

        } catch (PersistenceException | ContainerException e) {
            System.out.println(e.getMessage());
        }
    }
}
