package org.hbrs.se1.ws24.exercises.uebung4.control;

import java.util.List;
import java.util.Scanner;

import org.hbrs.se1.ws24.exercises.uebung2.control.Container;
import org.hbrs.se1.ws24.exercises.uebung2.control.ContainerException;
import org.hbrs.se1.ws24.exercises.uebung2.control.Member;
import org.hbrs.se1.ws24.exercises.uebung3.persistence.PersistenceException;
import org.hbrs.se1.ws24.exercises.uebung3.view.MemberView;
import org.hbrs.se1.ws24.exercises.uebung4.model.ConcreteUserStory;
import org.hbrs.se1.ws24.exercises.uebung4.model.UserStory;

public class InputCli {
    Container container = Container.getInstance();

    public void eingabe() throws ContainerException, PersistenceException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("UserStory-Tool");
        Boolean breaker = false;
        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();
            switch (input) {
                case "enter":
                    System.out.print("id: ");
                    Integer id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("titel: ");
                    String titel = scanner.nextLine();

                    System.out.print("akzeptanzkriterium: ");
                    String akzeptanzkriterium = scanner.nextLine();

                    System.out.print("mehrwert: ");
                    Integer mehrwert = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("strafe: ");
                    Integer strafe = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("aufwand: ");
                    Integer aufwand = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("risiko: ");
                    Integer risiko = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("priorität: ");
                    Double priorität = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("epic: ");
                    String epic = scanner.nextLine();

                    System.out.print("userstory: ");
                    String userstory = scanner.nextLine();

                    System.out.print("projekt: ");
                    String projekt = scanner.nextLine();

                    UserStory userStory = new ConcreteUserStory(id, titel, akzeptanzkriterium, mehrwert, strafe,
                            aufwand, risiko, priorität, epic, userstory, projekt);
                    container.addMember(userStory);
                    System.out.println("UserStory wurde hinzugefügt");
                    break;

                case "store":
                    container.store();
                    System.out.println("UserStory wurde abgespeichert");
                    break;
                case "load":
                    container.load();
                    System.out.println("UserStory wurde erfolgreich geladen");
                    break;
                case "dump":
                    System.out.println("UserStories werden in der reihenfolge der höchsten priorität ausgegeben");
                    container.dump();
                    break;
                case "search":
                    System.out.println("gebe den Projektnamen an, um die zugehörigen UserStories zu bekommen");
                    String project = scanner.nextLine();
                    List<Member> searchresultList = container.searchUserStory(project);
                    MemberView memberView = new MemberView();
                    memberView.dump(searchresultList);
                    break;
                case "exit":
                    System.out.println("Eingabe wird beendet");
                    breaker = true;

                    break;
                case "help":
                    System.out.println("liste der verfügbaren Befehle: enter, store, load, dump, search, exit");
                    break;
                default:
                    System.out.println("Befehl nicht erkannt, schreibe help für eine liste verfügbarer Befehle");
                    break;
            }
            if (breaker) {
                break;
            }
        }
        scanner.close();
    }
}
