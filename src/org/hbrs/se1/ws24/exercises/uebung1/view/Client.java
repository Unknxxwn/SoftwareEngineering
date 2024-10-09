package org.hbrs.se1.ws24.exercises.uebung1.view;

import org.hbrs.se1.ws24.exercises.uebung1.control.Translator;
import org.hbrs.se1.ws24.exercises.uebung1.control.factory.TranslatorFactory;

public class Client {
	private Translator translator;

	/**
	 * Methode zur Ausgabe einer Zahl auf der Console
	 * (auch bezeichnet als CLI, Terminal)
	 *
	 */
	// Dependency Injection für den Translator über einen Assembler
	public Client(Translator translator) {
		this.translator = translator;
	}

	// Dependency Injection für den Translator
	public Client() {
		this.translator = TranslatorFactory.createTranslator();
	}

	public void display(int aNumber) {
		// In dieser Methode soll die Methode translateNumber
		// mit dem übergegebenen Wert der Variable aNumber
		// aufgerufen werden.
		//
		// Strenge Implementierung (nur) gegen das Interface Translator gewuenscht!
		String result = translator.translateNumber(aNumber);
		System.out.println("Das Ergebnis der Berechnung: " +
				result);

	}
}
