/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestiondefichiers;

/**
 *
 * @author DELL LATITUDE
 */
public class GestionDeFichiers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FichierSimple fichier1 = new FichierSimple("file1.txt", "01-01-2024", 500);
        FichierSimple fichier2 = new FichierSimple("file2.txt", "02-01-2024",300);

        Repertoire repertoire1 = new Repertoire("repertoire1", "01-01-2024");
        
        repertoire1.AjouterFichier(fichier1);
        repertoire1.AjouterFichier(fichier2);

        FichierSimple fichier3 = new FichierSimple("file3.txt", "03-01-2024",700);
        Repertoire repertoire2 = new Repertoire("repertoire2", "02-01-2024");
        
        repertoire2.AjouterFichier(fichier3);
        repertoire2.AjouterFichier(repertoire1);

        Repertoire root = new Repertoire("root", "01-01-2024");
        root.AjouterFichier(repertoire2);

        System.out.println("Taille de " + fichier1.getUrl() + ": " + fichier1.getTaille() + " octets");
        System.out.println("Taille de " + fichier2.getUrl() + ": " + fichier2.getTaille() + " octets");
        System.out.println("Taille de " + repertoire1.getUrl() + ": " + repertoire1.getTaille() + " octets");
        System.out.println("Taille de " + fichier3.getUrl() + ": " + fichier3.getTaille() + " octets");
        System.out.println("Taille de " + repertoire2.getUrl() + ": " + repertoire2.getTaille() + " octets");
        System.out.println("Taille de " + root.getUrl() + ": " + root.getTaille() + " octets");
    }
    
}
