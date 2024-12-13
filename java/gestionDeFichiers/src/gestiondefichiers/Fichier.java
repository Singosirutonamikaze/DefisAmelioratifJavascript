/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondefichiers;

/**
 *
 * @author DELL LATITUDE
 */
abstract class Fichier {
    protected Repertoire repertoireParent;
    protected String nomFichier;
    protected String dateDeCreation;
    
    //Constructeur
    public Fichier(String _nomFichier, String _dateDeCreation) {
        this.nomFichier = _nomFichier;
        this.dateDeCreation = _dateDeCreation;
    }
    
    //Accesseurs

    public String getNomFichier() {
        return nomFichier;
    }

    public String getDateDeCreation() {
        return dateDeCreation;
    }
    
     public void setNomFichier(String _nomFichier) {
        this.nomFichier = _nomFichier;
    }

    public void setDateDeCreation(String dateDeCreation) {
        this.dateDeCreation = dateDeCreation;
    }
    
    public void setRepertoireParent(Repertoire repertoireParent) {
        this.repertoireParent = repertoireParent;
    }

    public Repertoire getRepertoireParent() {
        return repertoireParent;
    }
    
    abstract int getTaille();
    
    public String getUrl(){
        if (repertoireParent != null) {
            return repertoireParent.getUrl() + "/" + nomFichier;
        } else {
            return nomFichier; // Si le fichier n'a pas de répertoire parent (pour root par exemple)
        }
    }
    
}
