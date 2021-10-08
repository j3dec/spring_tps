package entites;

import entites2.Personne;

import javax.sound.midi.Soundbank;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adr = new AdressePostale(3,"Rue de la Paix", 2400,"Périgeux");

        Personne p1 = new Personne("Jean", "Paul", adr);
        Personne p2 = new Personne("Paul", "Jacques");
        System.out.println(p1);
        System.out.println(p2);

        // Modify name
        String nom = "Pierre";
        p1.setNom(nom);
        System.out.println("p1 modif : ");
        System.out.println(p1);
    }

}
