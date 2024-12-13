/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionnotesetudiant;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL LATITUDE
 */
public class Parcours {
    private List<Etudiant> etudiantsInscrits;
    private List<Etablissement> etablissements;
    private String nomParcours;
    private String dureeParcours;

    //constructeur de parcours
    public Parcours(String _nomParcours, String _dureeParcours) {
        this.nomParcours = _nomParcours;
        this.dureeParcours = _dureeParcours;
        this.etudiantsInscrits = new ArrayList<>();
    }

    //Les accesseurs
    public String getDureeParcours() {
        return dureeParcours;
    }
    public void setDureeParcours(String dureeParcours) {
        this.dureeParcours = dureeParcours;
    }
    
    public List<Etudiant> getEtudiantsInscrits() {
        return etudiantsInscrits;
    }
    
    public void setEtudiantsInscrits(List<Etudiant> etudiantsInscrits) {
        this.etudiantsInscrits = etudiantsInscrits;
    }

    public List<Etablissement> getEtablissements() {
        return etablissements;
    }
    
    public void setEtablissements(List<Etablissement> etablissements) {
        this.etablissements = etablissements;
    }
    
    public String getNomParcours() {
        return nomParcours;
    }

    public void setNomParcours(String nomParcours) {
        this.nomParcours = nomParcours;
    }
    
    //ajouter parcours aux etablissement et les etudiants au divers parcours
    public void ajouterEtudiant(Etudiant etudiant) {
        this.etudiantsInscrits.add(etudiant);
    }

}
