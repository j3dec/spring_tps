package banque.entities;

public class CompteTaux extends Compte {
    int tauxRenum;

    public CompteTaux(int numCompte, int soldeCompte, int tauxRenum) {
        super(numCompte, soldeCompte);
        this.tauxRenum = tauxRenum;
    }

    public String toString() {
        return "Numéro de compte : " + numCompte + "\n" + "Solde :" + soldeCompte + "\n" + "Taux de rémunération : " + tauxRenum;
    }
}
