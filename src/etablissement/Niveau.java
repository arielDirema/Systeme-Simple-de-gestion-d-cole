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
public class Niveau {
    private int id;
    private String libelleCourt;
    private String libelleLong;
    List<Classe> classes;

    // CONSTRUCTEURS
    public Niveau() {

    }

    public Niveau(int _id, String _libelleCourt, String _libelleLong) {
        this.id = _id;
        this.libelleCourt = _libelleCourt;
        this.libelleLong = _libelleLong;
        classes = new ArrayList<>();
    }

    // ACCESSEURS
    // GETTERS
    public int getId() {
        return this.id;
    }

    public String getLibelleCourt() {
        return this.libelleCourt;
    }

    public String getLibelleLong() {
        return this.libelleLong;
    }

    // SETTERS
    public void setId(int _id) {
        this.id = _id;
    }

    public void setLibelleCourt(String _libelleCourt) {
        this.libelleCourt = _libelleCourt;
    }

    public void setLibelleLong(String _libelleLong) {
        this.libelleLong = _libelleLong;
    }

    // AJOUT, SUPPRESSION et ACCES SUR CLASSES
    public void addClasse(Classe _classe) {
        this.classes.add(_classe);
    }

    public void removeClasse(Classe _classe) {
        this.classes.remove(_classe);
    }

    public List<Classe> getClasses() {
        return this.classes;
    }
}
