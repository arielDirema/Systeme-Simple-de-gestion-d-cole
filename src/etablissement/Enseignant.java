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
public class Enseignant extends Personne{
     private String titre;
    public List<Discipline> disciplines;

    public Enseignant() {

    }

    public Enseignant(int _id, String _nom, String _prenom, int _age, String _titre) {
        super(_id, _nom, _prenom, _age);
        this.titre = _titre;
        disciplines = new ArrayList<>();
    }

    // ACCESSEURS
    public String getTitre() {
        return this.titre;
    }

    public void setTitre(String _titre) {
        this.titre = _titre;
    }

    // AJOUT, SUPPRESSION ET ACCES SUR DISCIPLINES
    public void addDiscipline(Discipline _discipline) {
        this.disciplines.add(_discipline);
    }

    public void removeDiscipline(Discipline _discipline) {
        this.disciplines.remove(_discipline);
    }

    public List<Discipline> getDisciplines() {
        return this.disciplines;
    }
}
