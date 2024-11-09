package org.hbrs.se1.ws24.exercises.uebung2.control;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.hbrs.se1.ws24.exercises.uebung3.persistence.PersistenceException;
import org.hbrs.se1.ws24.exercises.uebung3.persistence.PersistenceStrategy;
import org.hbrs.se1.ws24.exercises.uebung3.view.MemberView;
import org.hbrs.se1.ws24.exercises.uebung4.control.ConcreteUserStory;

public class Container {
    private PersistenceStrategy<Member> persistenceStrategy = null;
    private List<Member> memberList = null;

    private static Container containerInstance = null;

    public static synchronized Container getInstance() {
        if (containerInstance == null) {
            synchronized (Container.class) {
                if (containerInstance == null) {
                    containerInstance = new Container();
                }
            }
        }
        return containerInstance;
    }

    private Container() {
        this.memberList = new ArrayList<Member>();
    }

    public void setStrategy(PersistenceStrategy<Member> persistenceStrategy) {
        this.persistenceStrategy = persistenceStrategy;
    }

    public void addMember(Member member) throws ContainerException {
        if (member == null || member.getID() == null) {
            throw new ContainerException("Null wert als  Member-Objekt oder Member ID nicht gültig!");
        }
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
        Member compareMember = null;
        for (int i = 0; i < memberList.size(); i++) {
            compareMember = memberList.get(i);
            if (compareMember.getID().equals(id)) {
                memberList.remove(i);
                return "Der Member mit der ID = " + compareMember.getID() + " wurde gelöscht";
            }
        }
        return "Der Member mit der ID = "
                + id +
                " ist nicht vorhanden";
    }

    public List<Member> getCurrentList() {
        return memberList;
    }

    public Integer size() {
        return memberList.size();
    }

    public void dump() {
        MemberView memberView = new MemberView();
        List<Member> sortedList = memberList.stream()
                .filter(member -> member instanceof ConcreteUserStory)
                .sorted(Comparator.comparingDouble(member -> ((ConcreteUserStory) member).getPriorität()))
                .collect(Collectors.toList());
        memberView.dump(sortedList);
    }

    public List<Member> searchUserStory(String searchTerm) {
        List<Member> resultList = new ArrayList<>();
        for (Member member : memberList) {
            if (member instanceof ConcreteUserStory) {
                ConcreteUserStory concreteUserStory = (ConcreteUserStory) member;
                if (concreteUserStory.getProjekt().equals(searchTerm)) {
                    resultList.add(member);
                }
            }
        }
        return resultList;
    }

    public void store() throws PersistenceException {
        if (this.persistenceStrategy == null) {
            throw new PersistenceException(PersistenceException.ExceptionType.NoStrategyIsSet,
                    "Strategie nicht gesetzt!");
        }
        try {
            this.persistenceStrategy.save(this.memberList);

        } catch (UnsupportedOperationException e) {
            throw new PersistenceException(PersistenceException.ExceptionType.ImplementationNotAvailable,
                    "Strategie nicht implementiert!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void load() throws PersistenceException {
        if (this.persistenceStrategy == null) {
            throw new PersistenceException(PersistenceException.ExceptionType.NoStrategyIsSet,
                    "Strategie nicht gesetzt!");
        }
        try {
            List<Member> liste = this.persistenceStrategy.load();
            this.memberList = liste;

        } catch (UnsupportedOperationException e) {
            throw new PersistenceException(PersistenceException.ExceptionType.ImplementationNotAvailable,
                    "Strategie nicht implementiert!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
