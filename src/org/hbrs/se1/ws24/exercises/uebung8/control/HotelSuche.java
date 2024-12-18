package org.hbrs.se1.ws24.exercises.uebung8.control;

import org.hbrs.se1.ws24.exercises.uebung8.model.SuchAuftrag;

public class HotelSuche {
    private ReiseAdapter reiseAdapter;
    private SuchAuftrag suchAuftrag;

    public HotelSuche() {
        this.reiseAdapter = new ReiseAdapter();
    }

    public void suche(String land, String ort, String datum, Integer sterne) {
        suchAuftrag = new SuchAuftrag(land, ort, datum, sterne);
        reiseAdapter.suche(suchAuftrag);
    }
}
