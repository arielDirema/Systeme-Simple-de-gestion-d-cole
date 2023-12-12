/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etablissement;

import java.util.*;

/**
 *
 * @author hp
 */
public class Classe {
    private int id;
    private String subdivision;
    Niveau niveau;
    List<Eleve> eleves;

    // CONSTRUCTEURS
    public Classe() {

    }

    public Classe(int _id, String _subdivision) {
        this.id = _id;
        this.subdivision = _subdivision;
        eleves = new ArrayList<>();
    }

    // ACCESSEURS
    // GETTERS
    public int getId() {
        return this.id;
    }

    public String getSubdivision() {
        return this.subdivision;
    }

    public Niveau getNiveau() {
        return this.niveau;
    }

    // SETTERS
    public void setId(int _id) {
        this.id = _id;
    }

    public void setSubdivision(String _subdivision) {
        this.subdivision = _subdivision;
    }

    public void setNiveau(Niveau _niveau) {
        this.niveau = _niveau;
    }

    // AJOUT , SUPPRESSION ET ACCES SUR ELEVES
    public void addEleve(Eleve _eleve) {
        this.eleves.add(_eleve);
    }

    public void removeEleve(Eleve _eleve) {
        this.eleves.remove(_eleve);
    }

    public void getListeEleves() {
        System.out.println("___________________________________");
        System.out.println("|ID\t|NOM\t|PRENOM\t|MATRICULE|");
        System.out.println("-----------------------------------");
        for (Eleve eleve : this.eleves) {
            System.out.println("|" + eleve.getId() + "\t|" + eleve.getNom() + "\t|" + eleve.getPrenom() + "\t|" + eleve.getMatricule() + "\t  |");
        }
    }

    public List<Eleve> getEleves() {
        return this.eleves;
    }
}
