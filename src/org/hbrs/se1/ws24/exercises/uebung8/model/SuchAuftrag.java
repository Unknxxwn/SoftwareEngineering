package org.hbrs.se1.ws24.exercises.uebung8.model;

public class SuchAuftrag {
    private String land;
    private String ort;
    private String datum;
    private int sterne;

    public SuchAuftrag(String land, String ort, String datum, int sterne) {
        this.land = land;
        this.ort = ort;
        this.datum = datum;
        this.sterne = sterne;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public int getSterne() {
        return sterne;
    }

    public void setSterne(int sterne) {
        this.sterne = sterne;
    }
}
