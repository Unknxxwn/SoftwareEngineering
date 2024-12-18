package org.hbrs.se1.ws24.exercises.uebung8.control;

import org.hbrs.se1.ws24.exercises.uebung8.model.SuchAuftrag;
import org.hbrs.se1.ws24.exercises.uebung8.model.SuchErgebnis;

public interface SuchInterface {
    public SuchErgebnis suche(SuchAuftrag suchAuftrag);
}
