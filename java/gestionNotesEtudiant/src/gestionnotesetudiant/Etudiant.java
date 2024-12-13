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
public class Etudiant {
    private Ordinateur ordinateur;
    private Parcours parcourChoisi;
    private int numeroDeCarte;
    private String nomEtudiant;
    private String prenomEtudiant;
    private String dateDeNaissance;
    private String emailEtudiant;
    private long telephoneEtudiant;
    private final List<InscriptionUE> inscriptions = new ArrayList<>(); // Liste des inscriptions

    // Constructeur
    public Etudiant(int _numeroDeCarte, String _nomEtudiant, String _prenomEtudiant, String _dateDeNaissance, String _emailEtudiant, long _telephoneEtudiant) {
        this.numeroDeCarte = _numeroDeCarte;
        this.nomEtudiant = _nomEtudiant;
        this.prenomEtudiant = _prenomEtudiant;
        this.dateDeNaissance = _dateDeNaissance;
        this.emailEtudiant = _emailEtudiant;
        this.telephoneEtudiant = _telephoneEtudiant;
    }

    // Accesseurs et mutateurs
    public Ordinateur getOrdinateur() {
        return ordinateur;
    }

    public void setOrdinateur(Ordinateur _ordinateur) {
        this.ordinateur = _ordinateur;
    }

    public Parcours getParcourChoisi() {
        return parcourChoisi;
    }

    public void setParcourChoisi(Parcours _parcourChoisi) {
        this.parcourChoisi = _parcourChoisi;
    }

    public int getNumeroDeCarte() {
        return numeroDeCarte;
    }

    public void setNumeroDeCarte(int _numeroDeCarte) {
        this.numeroDeCarte = _numeroDeCarte;
    }

    public String getNomEtudiant() {
        return nomEtudiant;
    }

    public void setNomEtudiant(String _nomEtudiant) {
        this.nomEtudiant = _nomEtudiant;
    }

    public String getPrenomEtudiant() {
        return prenomEtudiant;
    }

    public void setPrenomEtudiant(String _prenomEtudiant) {
        this.prenomEtudiant = _prenomEtudiant;
    }

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(String _dateDeNaissance) {
        this.dateDeNaissance = _dateDeNaissance;
    }

    public String getEmailEtudiant() {
        return emailEtudiant;
    }

    public void setEmailEtudiant(String _emailEtudiant) {
        this.emailEtudiant = _emailEtudiant;
    }

    public long getTelephoneEtudiant() {
        return telephoneEtudiant;
    }

    public void setTelephoneEtudiant(long _telephoneEtudiant) {
        this.telephoneEtudiant = _telephoneEtudiant;
    }


    public List<InscriptionUE> getInscriptions() {
        return inscriptions;
    }

    public void ajouterInscription(InscriptionUE inscription) {
        this.inscriptions.add(inscription);
    }

    public void afficherEtudiant() {
        System.out.println("************** Informations de l'Étudiant *************** ");
        System.out.println("Nom : " + this.nomEtudiant);
        System.out.println("Prénom : " + this.prenomEtudiant);
        System.out.println("Date de naissance : " + this.dateDeNaissance);
        System.out.println("Email : " + this.emailEtudiant);
        System.out.println("Téléphone : " + this.telephoneEtudiant);
        System.out.println("Numéro de carte : " + this.numeroDeCarte);
        
        if (parcourChoisi != null) {
            System.out.println("Parcours choisi : " + parcourChoisi.getNomParcours());
        } else {
            System.out.println("Parcours choisi : Aucun");
        }
        
        System.out.println("Ordinateur attribué : ");
        if (ordinateur != null) {
            System.out.println("Marque : " + ordinateur.getMarque());
            System.out.println("Modèle : " + ordinateur.getModele());
            System.out.println("Numéro de série : " + ordinateur.getNumeroDeSerie());
        } else {
            System.out.println("Aucun ordinateur attribué.");
        }
        
        System.out.println(" ");
    }
}

