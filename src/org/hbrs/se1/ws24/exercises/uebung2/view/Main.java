package org.hbrs.se1.ws24.exercises.uebung2.view;

import org.hbrs.se1.ws24.exercises.uebung2.control.ConcreteMember;
import org.hbrs.se1.ws24.exercises.uebung2.control.Container;
import org.hbrs.se1.ws24.exercises.uebung2.control.Member;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        Member member = new ConcreteMember(1);
        try {
            container.addMember(member);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
