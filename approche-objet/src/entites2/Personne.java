package entites2;

import entites.AdressePostale;

import java.util.Locale;

public class Personne {
    String nom;
    String prenom;
    AdressePostale adr;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom, AdressePostale adr) {
        this.nom = nom;
        this.prenom = prenom;
        this.adr = adr;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public AdressePostale getAdr() {
        return adr;
    }

    public void setAdr(AdressePostale adr) {
        this.adr = adr;
    }

    public String toString() {
        return nom + " " + prenom + " " + adr;
    }

    public String identityUpperCase() {
        return nom.toUpperCase(Locale.ROOT) + " " + prenom.toUpperCase();
    }

}


