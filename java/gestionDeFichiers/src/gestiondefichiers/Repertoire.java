/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondefichiers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL LATITUDE
 */
public class Repertoire  extends Fichier{
    protected List<Fichier> fichiers;

    public Repertoire(String _nomFichier, String _dateDeCreation) {
        super(_nomFichier, _dateDeCreation);
        this.fichiers = new ArrayList<>();
    }
    
    //Ajout de Fichiers
    public void AjouterFichier(Fichier _nouveauFichier){
        this.fichiers.add(_nouveauFichier);
    }
    
    public void setFichiers(List<Fichier> _fichiers) {
        this.fichiers = _fichiers;
    }

    public List<Fichier> getFichiers() {
        return fichiers;
    }
  
    @Override
    public int getTaille() {
        int tailleTotale = 0;
        for (Fichier fichier : fichiers) {
            tailleTotale += fichier.getTaille(); 
        }
        return tailleTotale;
    }
    
    @Override
    public String getUrl() {
        return "/" + getNomFichier(); 
    }
}
