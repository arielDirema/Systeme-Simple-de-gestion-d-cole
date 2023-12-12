/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etablissement;

/**
 *
 * @author hp
 */
public class Discipline {
    private int id;
    private String libelle;

    // CONSTRUCTEURS
    public Discipline() {

    }

    public Discipline(int _id, String _libelle) {
        this.id = _id;
        this.libelle = _libelle;
    }

    // ACCESSEURS
    public int getId() {
        return this.id;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public void setId(int _id) {
        this.id = _id;
    }

    public void setLibelle(String _libelle) {
        this.libelle = _libelle;
    }
}
