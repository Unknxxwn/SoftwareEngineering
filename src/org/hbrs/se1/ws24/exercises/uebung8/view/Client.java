package org.hbrs.se1.ws24.exercises.uebung8.view;

import org.hbrs.se1.ws24.exercises.uebung8.control.HotelSuche;

public class Client {
    HotelSuche hotelSuche = new HotelSuche();

    public void search() {
        hotelSuche.suche("Test", "Test", "Test", 0);
    }
}
