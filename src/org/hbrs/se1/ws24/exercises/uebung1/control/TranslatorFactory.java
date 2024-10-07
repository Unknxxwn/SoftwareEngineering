package org.hbrs.se1.ws24.exercises.uebung1.control;

public class TranslatorFactory {
    // Factory Method Design Pattern
    public static Translator createTranslator() {
        // kann später erweitert werden um für bestimmte cases den richtigen
        // Translator zurück zu geben
        // -> also if("German"){return new Germantranslator}if(X){return new
        // OtherTranslator}...
        return new GermanTranslator();
    }
}
