package org.hbrs.se1.ws24.exercises.uebung1.view;

import org.hbrs.se1.ws24.exercises.uebung1.control.GermanTranslator;
import org.hbrs.se1.ws24.exercises.uebung1.control.Translator;

//Dependency Injection über den Client Konstruktor
public class Assembler {
    public static void main(String[] args) {
        Translator germanTranslator = new GermanTranslator();
        Client client = new Client(germanTranslator);
        client.display(1);
    }
}
