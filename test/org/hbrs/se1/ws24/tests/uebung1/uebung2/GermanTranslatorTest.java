package org.hbrs.se1.ws24.tests.uebung1.uebung2;

import static org.junit.jupiter.api.Assertions.*;
import org.hbrs.se1.ws24.exercises.uebung1.control.GermanTranslator;
import org.hbrs.se1.ws24.exercises.uebung1.control.Translator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GermanTranslatorTest {
    private Translator translator = null;

    @BeforeEach
    public void initialize() {
        this.translator = new GermanTranslator();
    }

    @Test
    public void testWithValidNumber() {
        // positiver test
        assertEquals("fünf", translator.translateNumber(5));
    }

    @Test
    public void testWithInvalidNumber() {
        // negativer test
        String test = "Übersetzung der Zahl " + "11" + " nicht möglich" + " V" + Translator.version;
        assertEquals(test, translator.translateNumber(11));
    }

    @Test
    public void testWithInvalidNumberNegative() {
        // negativer test
        String test = "Übersetzung der Zahl " + "-1" + " nicht möglich" + " V" + Translator.version;
        assertEquals(test, translator.translateNumber(-1));
    }

    @Test
    public void testWithInvalidNumberZero() {
        // null test
        String test = "Übersetzung der Zahl " + "0" + " nicht möglich" + " V" + Translator.version;
        assertEquals(test, translator.translateNumber(0));
    }

}