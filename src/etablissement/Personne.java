/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etablissement;

/**
 *
 * @author hp
 */
public abstract class Personne {
    protected int id;
    protected String nom;
    protected String prenom;
    protected int age;

    // CONSTRUCTEURS
    public Personne() {
    }

    public Personne(int _id, String _nom, String _prenom, int _age) {
        this.id = _id;
        this.nom = _nom;
        this.prenom = _prenom;
        this.age = _age;
    }

    // ACCESSEURS
    public int getId() {
        return this.id;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public int getAge() {
        return this.age;
    }

    public void setId(int _id) {
        this.id = _id;
    }

    public void setNom(String _nom) {
        this.nom = _nom;
    }

    public void setPrenom(String _prenom) {
        this.prenom = _prenom;
    }

    public void setAge(int _age) {
        this.age = _age;
    }
}
