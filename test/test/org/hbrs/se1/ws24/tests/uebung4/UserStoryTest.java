package test.org.hbrs.se1.ws24.tests.uebung4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.hbrs.se1.ws24.exercises.uebung2.control.Container;
import org.hbrs.se1.ws24.exercises.uebung2.control.ContainerException;
import org.hbrs.se1.ws24.exercises.uebung4.model.ConcreteUserStory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserStoryTest {
    private Container container = null;
    private ConcreteUserStory userStory1;
    private ConcreteUserStory userStory2;

    @BeforeEach
    void setup() {
        container = Container.getInstance();
        container.clearListForTest();
        userStory1 = new ConcreteUserStory(1, "test1", "test", 1, 1, 1, 1, "test", "erfolgreicher test", "Testung");
        userStory2 = new ConcreteUserStory(2, "test2", "test", 1, 1, 1, 1, "test", "erfolgreicher test", "Testung");
    }

    @Test
    public void checkStateEmptyContainer() {
        assertEquals(0, container.size());
    }

    @Test
    public void testAddNullStory() {
        assertThrows(ContainerException.class, () -> {
            container.addMember(null);
        });
        assertEquals(0, container.size());
    }

    @Test
    public void testAddStory() {
        try {
            container.addMember(userStory1);
            container.addMember(userStory2);
        } catch (ContainerException e) {
            e.printStackTrace();
        }
        assertEquals(2, container.size());
    }

    @Test
    public void testAddAndDeleteStory() {
        try {
            container.addMember(userStory1);
            assertEquals(1, container.size());
            container.deleteMember(1);
            assertEquals(0, container.size());
        } catch (ContainerException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testPrioCalculation() {
        ConcreteUserStory calculteStoryPrio = new ConcreteUserStory(3, "test3", "test", 1, 1, 1, 1, "test",
                "erfolgreicher test", "Testung");
        assertEquals(1, calculteStoryPrio.getPriorität());
    }
}
