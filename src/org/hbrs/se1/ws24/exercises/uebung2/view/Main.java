package org.hbrs.se1.ws24.exercises.uebung2.view;

import org.hbrs.se1.ws24.exercises.uebung2.control.ConcreteMember;
import org.hbrs.se1.ws24.exercises.uebung2.control.Container;
import org.hbrs.se1.ws24.exercises.uebung2.control.Member;

public class Main {
    public static void main(String[] args) {
        Container container = Container.getInstance();
        Member member = new ConcreteMember(1);
        Member member1 = new ConcreteMember(2);
        try {
            container.addMember(member);
            container.addMember(member1);

        } catch (Exception e) {
            System.out.println(e);
        }
        container.dump();

        // System.out.println(container.deleteMember(1));
        // System.out.println(container.size());
    }
}
