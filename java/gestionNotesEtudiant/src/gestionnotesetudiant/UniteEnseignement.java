/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionnotesetudiant;

import java.util.List;

/**
 *
 * @author DELL LATITUDE
 */
public class UniteEnseignement {
    private String codeUE;
    private String intituleUE;
    private int coefficient;
    private List<InscriptionUE> inscriptions;
    
    //constructeur
    public UniteEnseignement(String _codeUE, String _intituleUE, int _coefficient){
        this.codeUE = _codeUE;
        this.intituleUE = _intituleUE;
        this.coefficient = _coefficient;
    }

    //Les accesseurs en lecture et en ecriture
    public String getCodeUE() {
        return codeUE;
    }

    public void setCodeUE(String _codeUE) {
        this.codeUE = _codeUE;
    }

    public String getIntituleUE() {
        return intituleUE;
    }

    public void setIntituleUE(String _intituleUE) {
        this.intituleUE = _intituleUE;
    }
    
    public int getCoefficient() {
        return coefficient;
    }

    public void setCoeficient(int _coefficient) {
        this.coefficient = _coefficient;
    }
    
    public void ajouterInscription(InscriptionUE inscription) {
        this.inscriptions.add(inscription);
    } 
    
    // Méthode pour calculer la moyenne finale pondérée de l'UE
    public float calculerMoyenneFinale() {
        float sommeMoyennesPonderees = 0;
        int sommeCoefficients = 0;

        // Calculer la somme des moyennes pondérées pour cette UE
        for (InscriptionUE inscription : inscriptions) {
            float moyenne = inscription.getMoyenne();
            float coefficientUe = inscription.getUniteEnseignement().getCoefficient();
            sommeMoyennesPonderees += moyenne * coefficientUe;
            sommeCoefficients += coefficientUe;
        }

        // Calculer la moyenne générale pondérée
        return sommeMoyennesPonderees / sommeCoefficients;
    }

    // Méthode pour récupérer toutes les moyennes finales pondérées des étudiants dans cette UE
    public float[] obtenirMoyennesFinales() {
        float[] moyennes = new float[inscriptions.size()];
        int index = 0;

        // Récupérer les moyennes pondérées de chaque étudiant
        for (InscriptionUE inscription : inscriptions) {
            float moyenne = inscription.getMoyenne();
            float coefficientUe = inscription.getUniteEnseignement().getCoefficient();
            moyennes[index] = moyenne * coefficientUe;
            index++;
        }

        return moyennes;
    }

    // Calculer la moyenne générale de toutes les UEs inscrites
    public static float calculerMoyenneGenerale(UniteEnseignement[] unitesEnseignements) {
        float sommeMoyennesPonderees = 0;
        int sommeCoefficients = 0;

        // Parcours des UEs et calcul des moyennes pondérées
        for (UniteEnseignement ue : unitesEnseignements) {
            float[] moyennes = ue.obtenirMoyennesFinales();
            for (float moyenne : moyennes) {
                sommeMoyennesPonderees += moyenne;
                sommeCoefficients += ue.getCoefficient();
            }
        }

        // Calcul de la moyenne générale
        return sommeMoyennesPonderees / sommeCoefficients;
    }
    
}

