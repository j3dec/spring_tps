package banque.entities;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TestBanque {

    public static void main(String[] args) {
        Compte [] compte_arr = new Compte[2];

        compte_arr[0] = new Compte(12039, 999999999);
        compte_arr[1] = new CompteTaux(12040, 109, 2 );

        for (Compte compte : compte_arr) {
            System.out.println(compte);
        }



    }

}