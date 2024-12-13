/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondefichiers;

/**
 *
 * @author DELL LATITUDE
 */
public class FichierSimple extends Fichier{
    protected int tailleFichier;

    public FichierSimple(String _nomFichier, String _dateDeCreation, int _tailleFichier) {
        super(_nomFichier, _dateDeCreation);
        this.tailleFichier = _tailleFichier;
    }
    
    @Override
    public int getTaille() {
        return this.tailleFichier;
    }
    
    public String getURL() {
        return nomFichier; 
    }
    
}
