package org.joliverie.sio.festival01.metier;

public class Representation {

    private String id;

    private String dateRepres;

    private String heureDebut;

    private String heureFin;

    private String groupe;

    private String lieu;

    // Constructeur

    public Representation(){}
    public Representation(String id, String dateRepres, String heureDebut, String heureFin, String groupe, String lieu) {
        this.id = id;
        this.dateRepres = dateRepres;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.groupe = groupe;
        this.lieu = lieu;
    }

    @Override
    public String toString() {
        return "Representation{" +
                "id='" + id + '\'' +
                ", date='" + dateRepres + '\'' +
                ", heure_debut='" + heureDebut + '\'' +
                ", heure_fin='" + heureFin + '\'' +
                ", groupe=" + groupe +
                ", lieu=" + lieu +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateRepres() {
        return dateRepres;
    }

    public void setDateRepres(String dateRepres) {
        this.dateRepres = dateRepres;
    }

    public String getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    public String getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(String heureFin) {
        this.heureFin = heureFin;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }
}
