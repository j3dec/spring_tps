package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adr = new AdressePostale(3,"Rue de la Paix", 2400,"Périgeux");
        AdressePostale adr2 = new AdressePostale(3,"Rue de la soif", 4400,"Nantes");
        Personne p1 = new Personne("Jean", "Paul", adr);
        Personne p2 = new Personne("Paul", "Jacques", adr2);
        System.out.println(p1);
        System.out.println(p2);
    }

}
