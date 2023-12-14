/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package etablissement;

import java.util.*;

/**
 *
 * @author hp
 */
public class Etablissement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanf = new Scanner(System.in);
        int choix;

        // CREATION DES CLASSES
        Classe sixieme = new Classe(6, "sixieme");
        Classe cinquieme = new Classe(5, "cinquieme");
        Classe quatrieme = new Classe(4, "quatrieme");
        Classe troisieme = new Classe(3, "troisieme");

        // CREATION ET INSCRIPTION DES ELEVES
        // TROISIEME
        Eleve eleveUn = new Eleve(1, "MADJA", "Ariel", 15, 100705);
        eleveUn.setClasseEleve(troisieme);
        Eleve eleveDeux = new Eleve(2, "YOYO", "Direma", 16, 017050);
        eleveDeux.setClasseEleve(troisieme);
        
        troisieme.addEleve(eleveUn);
        troisieme.addEleve(eleveDeux);

        // QUATRIEME
        Eleve eleveTrois = new Eleve(1, "KOKO", "James", 15, 123456);
        eleveTrois.setClasseEleve(quatrieme);
        Eleve eleveQuatre = new Eleve(2, "POLO", "choco", 14, 789012);
        eleveQuatre.setClasseEleve(quatrieme);
        
        quatrieme.addEleve(eleveTrois);
        quatrieme.addEleve(eleveQuatre);

        // CINQUIEME
        Eleve eleveCinq = new Eleve(1, "MALCOM", "Bobi", 14, 345678);
        eleveCinq.setClasseEleve(cinquieme);
        Eleve eleveSix = new Eleve(2, "SARI", "Luc", 13, 901234);
        eleveSix.setClasseEleve(cinquieme);
        
        cinquieme.addEleve(eleveCinq);
        cinquieme.addEleve(eleveSix);

        // SIXIEME
        Eleve eleveSept = new Eleve(1, "PACOM", "albert", 12, 567890);
        eleveSept.setClasseEleve(sixieme);
        Eleve eleveHuit = new Eleve(2, "BABALI", "Ousman", 11, 123456);
        eleveHuit.setClasseEleve(sixieme);
        Eleve eleveNeuf = new Eleve(3, "KALI", "Ares", 10, 789012);
        eleveNeuf.setClasseEleve(sixieme);
        
        sixieme.addEleve(eleveSept);
        sixieme.addEleve(eleveHuit);
        sixieme.addEleve(eleveNeuf);

        // SELECTION DE LA CLASSE PAR L'UTILISATEUR
        System.out.println("------------------numero 1 pour la sixieme------------------");
        System.out.println("-----------------numero 2 pour la cinquieme-----------------");
        System.out.println("-----------------numero 3 pour la quatrieme-----------------");
        System.out.println("-----------------numero 4 pour la troisieme-----------------");
        do {
            System.out.print("Entrez le numero de la classe dont vous voulez voir la liste : ");
            choix = scanf.nextInt();
        } while (choix < 1 || choix > 4);

        // APPEL DE LA FONCTION QUI VA LISTER LES ELEVES DE LA CLASSE CHOISIE
        switch (choix) {
            case 1:
                System.out.println("Liste des eleves de la classe de sixieme : ");
                sixieme.getListeEleves();
                break;
            case 2:
                System.out.println("Liste des eleves de la classe de cinquieme : ");
                cinquieme.getListeEleves();
                break;
            case 3:
                System.out.println("Liste des eleves de la classe de quatrieme : ");
                quatrieme.getListeEleves();
                break;
            case 4:
                System.out.println("Liste des eleves de la classe de troisieme : ");
                troisieme.getListeEleves();
                break;
            default:
                System.out.println("Erreur inconnue !!!");
                break;
        }
        
        System.out.println("Fin du programme");
    }
    
}
