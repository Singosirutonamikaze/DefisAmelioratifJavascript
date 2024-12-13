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
public class InscriptionUE {
    private Etudiant etudiant;
    private UniteEnseignement uniteEnseignement;
    private float moyenne;
    private List<InscriptionUE> inscriptions =  new ArrayList<>();

    // Constructeur
    public InscriptionUE(Etudiant _etudiant, UniteEnseignement _uniteEnseignement) {
        this.etudiant = _etudiant;
        this.uniteEnseignement = _uniteEnseignement;
        this.moyenne = 0.0f; // Moyenne initialisée à 0
    }

    // Accesseurs
    public Etudiant getEtudiant() {
        return etudiant;
    }

    public float getMoyenne() {
        return moyenne;
    }

    public UniteEnseignement getUniteEnseignement() {
        return uniteEnseignement;
    }
    
    // Méthode pour attribuer une moyenne
    public void assignerMoyenne(float _moyenne) {
        this.moyenne = _moyenne;
    }
    
    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public void setUniteEnseignement(UniteEnseignement uniteEnseignement) {
        this.uniteEnseignement = uniteEnseignement;
    }

    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }

    public void setInscriptions(List<InscriptionUE> inscriptions) {
        this.inscriptions = inscriptions;
    }
    
}
