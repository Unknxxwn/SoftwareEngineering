package org.hbrs.se1.ws24.exercises.uebung2.control;

import java.util.ArrayList;

public class Container {
    private Member member;
    private ArrayList<Member> memberList = null;

    public Container() {
        this.memberList = new ArrayList<Member>();
    }

    public void addMember(Member member) throws ContainerException {
        for (Member memberInList : memberList) {
            if (member.getID().equals(memberInList.getID())) {
                throw new ContainerException(
                        "Das Member-Objekt mit der ID "
                                + member.getID() +
                                " ist bereits vorhanden!");
            }
        }
        memberList.add(member);
    }

    public String deleteMember(Integer id) {
        for (int i = 0; i < memberList.size(); i++) {
            if (member.getID().equals(id)) {
                memberList.remove(i);
                return "Der Member mit der ID = " + member.getID() + " wurde gelöscht";
            }
        }
        return "Der Member mit der ID = "
                + member.getID() +
                " ist nicht vorhanden";
    }

    public void dump() {
        for (Member member : memberList) {
            System.out.println(member.toString());
        }
    }

    public Integer size() {
        return memberList.size();
    }
}
