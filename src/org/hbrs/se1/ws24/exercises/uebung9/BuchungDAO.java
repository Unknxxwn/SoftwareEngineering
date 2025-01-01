package org.hbrs.se1.ws24.exercises.uebung9;

import java.util.ArrayList;

public class BuchungDAO {
    private ArrayList<Buchung> buchungen = new ArrayList<Buchung>();
    private Buchung buchung;

    public void createBuchung(String Content) {
        buchung = new Buchung(Content);
        buchungen.add(buchung);
    }

    public Buchung getBuchung(Buchung buchungsearch) {
        Buchung result = null;
        for (Buchung buchung : buchungen) {
            if (buchungsearch.equals(buchung)) {
                result = buchung;
            }
        }
        return result;
    }

    public void updateBuchung(Buchung buchung, String content) {
        Buchung toUpdate = getBuchung(buchung);
        toUpdate.setContent(content);
    }

    public void removeBuchung(Buchung buchung) {
        buchungen.remove(buchung);
    }
}
