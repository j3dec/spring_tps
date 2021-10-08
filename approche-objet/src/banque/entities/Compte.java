package banque.entities;

public class Compte {

    int numCompte;
    long soldeCompte;

    public Compte(int numCompte, int soldeCompte) {
        this.numCompte = numCompte;
        this.soldeCompte = soldeCompte;
    }

    public int getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public long getSoldeCompte() {
        return soldeCompte;
    }

    public void setSoldeCompte(long soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

    public String toString() {
        return "Numéro de compte : " + numCompte + "\n" + "Solde :" + soldeCompte;
    }
}
