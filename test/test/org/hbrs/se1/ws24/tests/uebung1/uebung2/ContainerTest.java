package test.org.hbrs.se1.ws24.tests.uebung1.uebung2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.hbrs.se1.ws24.exercises.uebung2.control.ConcreteMember;
import org.hbrs.se1.ws24.exercises.uebung2.control.Container;
import org.hbrs.se1.ws24.exercises.uebung2.control.ContainerException;
import org.hbrs.se1.ws24.exercises.uebung2.control.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContainerTest {
    private Container container = null;

    @BeforeEach
    public void initialize() {
        this.container = new Container();
    }

    @Test
    public void testEmptyContainer() {
        assertEquals(0, container.size());
    }

    @Test
    public void testAddOneMember() {

        Member m1 = new ConcreteMember(33);
        try {
            container.addMember(m1);
        } catch (ContainerException e) {
            e.printStackTrace();
        }
        assertEquals(1, container.size());
    }

    @Test
    public void testAddTwoMember() {
        Member m1 = new ConcreteMember(20);
        Member m2 = new ConcreteMember(9);
        try {
            container.addMember(m1);
            container.addMember(m2);
        } catch (ContainerException e) {
            e.printStackTrace();
        }
        assertEquals(2, container.size());
    }

    @Test
    public void testAddDuplicateMember() {
        Member m1 = new ConcreteMember(1);
        Member m2 = new ConcreteMember(1);
        try {
            container.addMember(m1);
        } catch (ContainerException e) {
            e.printStackTrace();
        }
        assertThrows(ContainerException.class, () -> {
            container.addMember(m2);
        });
        assertEquals(1, container.size());

    }

    @Test
    public void testAddNullMember() {
        Member m1 = null;
        assertThrows(ContainerException.class, () -> {
            container.addMember(m1);
        });
        assertEquals(0, container.size());
    }

    @Test
    public void testAddNullIdMember() {
        Member m1 = new ConcreteMember(null);
        assertThrows(ContainerException.class, () -> {
            container.addMember(m1);
        });
        assertEquals(0, container.size());
    }

    @Test
    public void testDeleteWithNoMember() {
        assertEquals("Der Member mit der ID = 1 ist nicht vorhanden", container.deleteMember(1));
        assertEquals(0, container.size());
    }

    @Test
    public void testDeleteMember() {

        Member member = new ConcreteMember(3);
        try {
            container.addMember(member);
        } catch (ContainerException e) {
            e.printStackTrace();
        }
        assertEquals("Der Member mit der ID = 3 wurde gelöscht", container.deleteMember(3));
        assertEquals(0, container.size());
    }

    @Test
    public void testDeleteWithNaId() {
        Member m1 = new ConcreteMember(1);
        try {
            container.addMember(m1);
        } catch (ContainerException e) {
            e.printStackTrace();
        }
        assertEquals("Der Member mit der ID = 99 ist nicht vorhanden", container.deleteMember(99));
        assertEquals(1, container.size());
    }

    @Test
    public void testDump() {
        Member m1 = new ConcreteMember(1);
        Member m2 = new ConcreteMember(2);
        try {
            container.addMember(m1);
            container.addMember(m2);
        } catch (ContainerException e) {
            e.printStackTrace();
        }
        assertEquals(2, container.size());
    }

}
