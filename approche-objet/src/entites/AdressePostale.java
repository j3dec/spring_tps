package entites;

public class AdressePostale {
    int numRue;
    String libelleRue;
    int codePostal;
    String ville;

    public AdressePostale(int numRue, String libelleRue, int codePostal, String ville) {
        this.numRue = numRue;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public int getNumRue() {
        return numRue;
    }

    public void setNumRue(int numRue) {
        this.numRue = numRue;
    }

    public String getLibelleRue() {
        return libelleRue;
    }

    public void setLibelleRue(String libelleRue) {
        this.libelleRue = libelleRue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
