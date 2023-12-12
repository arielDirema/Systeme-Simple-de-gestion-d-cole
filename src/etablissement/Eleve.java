/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etablissement;

/**
 *
 * @author hp
 */
public class Eleve extends Personne{
    private int matricule;
    Classe classeEleve;

    // CONSTRUCTEURS
    public Eleve() {

    }

    public Eleve(int _id, String _nom, String _prenom, int _age, int _matricule) {
        super(_id, _nom, _prenom, _age);
        this.matricule = _matricule;
    }

    // ACCESSEURS
    // GETTERS
    public int getMatricule() {
        return this.matricule;
    }

    public Classe getClasseEleve() {
        return this.classeEleve;
    }

    // SETTERS
    public void setMatricule(int _matricule) {
        this.matricule = _matricule;
    }

    public void setClasseEleve(Classe _classeEleve) {
        this.classeEleve = _classeEleve;
    }
}
