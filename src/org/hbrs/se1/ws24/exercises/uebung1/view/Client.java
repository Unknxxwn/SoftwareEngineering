package org.hbrs.se1.ws24.exercises.uebung1.view;

import org.hbrs.se1.ws24.exercises.uebung1.control.Translator;
import org.hbrs.se1.ws24.exercises.uebung1.control.TranslatorFactory;

public class Client {

	/**
	 * Methode zur Ausgabe einer Zahl auf der Console
	 * (auch bezeichnet als CLI, Terminal)
	 *
	 */
	void display(int aNumber) {
		// In dieser Methode soll die Methode translateNumber
		// mit dem übergegebenen Wert der Variable aNumber
		// aufgerufen werden.
		//
		// Strenge Implementierung (nur) gegen das Interface Translator gewuenscht!
		// mehtodenaufruf returned den germantranslator -> der methoden aufruf wird also
		// eine Veriable zu gewiesen mit dem Interface Translator als typ
		Translator germanTranslator = TranslatorFactory.createTranslator();
		// methode wird durch germantranslator der in der Factory übergeben wird
		// aufgerufen um die nummer die im parameter gegeben wird zu übersetzen
		String result = germanTranslator.translateNumber(aNumber);
		System.out.println("Das Ergebnis der Berechnung: " +
				result);

	}
}
