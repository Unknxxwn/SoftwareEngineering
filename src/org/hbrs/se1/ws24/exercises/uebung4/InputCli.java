package org.hbrs.se1.ws24.exercises.uebung4;

import java.util.Scanner;

import org.hbrs.se1.ws24.exercises.uebung2.control.Container;

public class InputCli {
    Container container = Container.getInstance();

    public void eingabe() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("UserStory-Tool");
        while (true) {
            System.out.println("> ");
            String input = scanner.nextLine();
            switch (input) {
                case "enter":

                    break;
                case "store":

                    break;
                case "load":

                    break;
                case "dump":

                    break;
                case "search":

                    break;
                case "exit":

                    break;
                case "help":

                    break;
                default:
                    break;
            }
        }
    }
}
