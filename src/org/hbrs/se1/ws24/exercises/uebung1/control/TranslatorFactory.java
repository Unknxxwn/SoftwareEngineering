package org.hbrs.se1.ws24.exercises.uebung1.control;

public class TranslatorFactory {
    // Factory Method Design Pattern
    public static Translator createTranslator() {
        GermanTranslator germanTranslator = new GermanTranslator();
        return germanTranslator;
    }
}
