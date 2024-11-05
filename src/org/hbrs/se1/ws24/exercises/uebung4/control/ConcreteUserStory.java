package org.hbrs.se1.ws24.exercises.uebung4.control;

public class ConcreteUserStory implements UserStory {

    private Integer id;
    private String titel;
    private String akzeptanzkriterium;
    private Integer mehrwert;
    private Integer strafe;
    private Integer aufwand;
    private Integer risiko;
    private Double priorität;
    private String epic;
    private String projekt;

    public ConcreteUserStory(Integer id, String titel, String akzeptanzkriterium, Integer mehrwert, Integer strafe,
            Integer aufwand, Integer risiko, Double priorität, String epic, String projekt) {
        this.id = id;
        this.titel = titel;
        this.akzeptanzkriterium = akzeptanzkriterium;
        this.mehrwert = mehrwert;
        this.strafe = strafe;
        this.aufwand = aufwand;
        this.risiko = risiko;
        this.priorität = priorität;
        this.epic = epic;
        this.projekt = projekt;
    }

    @Override
    public String toString() {
        return "ConcreteUserStory [id=" + id + ", titel=" + titel + ", akzeptanzkriterium=" + akzeptanzkriterium
                + ", mehrwert=" + mehrwert + ", strafe=" + strafe + ", aufwand=" + aufwand + ", risiko=" + risiko
                + ", priorität=" + priorität + ", epic=" + epic + ", projekt=" + projekt + "]";
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAkzeptanzkriterium() {
        return akzeptanzkriterium;
    }

    public void setAkzeptanzkriterium(String akzeptanzkriterium) {
        this.akzeptanzkriterium = akzeptanzkriterium;
    }

    public Integer getMehrwert() {
        return mehrwert;
    }

    public void setMehrwert(Integer mehrwert) {
        this.mehrwert = mehrwert;
    }

    public Integer getStrafe() {
        return strafe;
    }

    public void setStrafe(Integer strafe) {
        this.strafe = strafe;
    }

    public Integer getAufwand() {
        return aufwand;
    }

    public void setAufwand(Integer aufwand) {
        this.aufwand = aufwand;
    }

    public Integer getRisiko() {
        return risiko;
    }

    public void setRisiko(Integer risiko) {
        this.risiko = risiko;
    }

    public Double getPriorität() {
        return priorität;
    }

    public void setPriorität(Double priorität) {
        this.priorität = priorität;
    }

    public String getEpic() {
        return epic;
    }

    public void setEpic(String epic) {
        this.epic = epic;
    }

    public String getProjekt() {
        return projekt;
    }

    public void setProjekt(String projekt) {
        this.projekt = projekt;
    }

    @Override
    public Integer getID() {
        return id;
    }

}
