package org.hbrs.se1.ws24.exercises.uebung1.control.factory;

import org.hbrs.se1.ws24.exercises.uebung1.control.GermanTranslator;
import org.hbrs.se1.ws24.exercises.uebung1.control.Translator;

public class TranslatorFactory {
    // Factory Method Design Pattern
    public static Translator createTranslator() {
        // kann später erweitert werden um für bestimmte cases den richtigen
        // Translator zurück zu geben
        // -> also if("German"){return new Germantranslator}if(X){return new
        // OtherTranslator}...
        GermanTranslator germanTranslator = new GermanTranslator();
        germanTranslator.setDate("Okt/2024");
        return germanTranslator;
    }
}
