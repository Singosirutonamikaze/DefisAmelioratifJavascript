/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionnotesetudiant;

/**
 *
 * @author DELL LATITUDE
 */
public class GestionNotesEtudiant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Etablissement etablissement1 = new Etablissement("Ecole Polytechnique de Lomé", "26/09/1970");
        Etablissement etablissement2 = new Etablissement("Ecole superieure des Affaires","20/10/2005");
        
        //Nouveau Parcours
        Parcours parcour1 = new Parcours("Genie Informatique", "3ans");
        
        
        //Création des UEs
        UniteEnseignement uniteEnseignement1 = new UniteEnseignement("INF1241", "POO", 5);
        UniteEnseignement uniteEnseignement2 = new UniteEnseignement("MTH1213", "Algèbre linéaire de base", 4);
       
        //Ajout des ordinateur
        Ordinateur ordinateur0 = new Ordinateur(1, "Dell", "Latitude");
        Ordinateur ordinateur1 = new Ordinateur(2, "HP", "Pavilion");
        Ordinateur ordinateur2 = new Ordinateur(3, "Lenovo", "ThinkPad");
        Ordinateur ordinateur3 = new Ordinateur(4, "Apple", "MacBook Pro");
        Ordinateur ordinateur4 = new Ordinateur(5, "Asus", "ZenBook");
        
        //creation d'un nouveau etudiant
        Etudiant etudiant1 = new Etudiant(1234, "KPONOU", "Ephraïm", "07/10/2005", "ephraim@gmail.com", 90575846);
        Etudiant etudiant2 = new Etudiant(1235, "MESSAN", "Elom Raïssa", "05/01/2007", "elom@gmail.com", 90575846);
        Etudiant etudiant3 = new Etudiant(1236, "ASSOUN", "Rodrigue", "06/07/2004", "rodrigue@gmail.com", 90575845);
        Etudiant etudiant4 = new Etudiant(1237, "TCHAMIE", "jephte", "07/06/2005", "jephte@gmail.com", 90575846);
        Etudiant etudiant5 = new Etudiant(1238, "SINGO","Yao Dieu Donné", "05/01/2006", "yaodieudonne@gmail.com", 90575846);
        
        //ajouter parcours
        etablissement1.AjouterParcours(parcour1);
        etablissement2.AjouterParcours(parcour1);
        
        //Affectation de l'ordinateur à l'étudiant
        etudiant1.setOrdinateur(ordinateur0);
        etudiant2.setOrdinateur(ordinateur1);
        etudiant3.setOrdinateur(ordinateur2);
        etudiant4.setOrdinateur(ordinateur3);
        etudiant5.setOrdinateur(ordinateur4);
        
        //inscrire les etudiants dans les UE
        parcour1.ajouterEtudiant(etudiant1);
        parcour1.ajouterEtudiant(etudiant2);
        parcour1.ajouterEtudiant(etudiant3);
        parcour1.ajouterEtudiant(etudiant4);
        parcour1.ajouterEtudiant(etudiant5);
        
        //Ajouter les étudiants à L'UE
        InscriptionUE inscription1 = new InscriptionUE(etudiant1, uniteEnseignement1);
        InscriptionUE inscription2 = new InscriptionUE(etudiant1, uniteEnseignement2);
        InscriptionUE inscription3 = new InscriptionUE(etudiant2, uniteEnseignement1);
        InscriptionUE inscription4 = new InscriptionUE(etudiant2, uniteEnseignement2);
        InscriptionUE inscription5 = new InscriptionUE(etudiant3, uniteEnseignement1);
        InscriptionUE inscription6 = new InscriptionUE(etudiant3, uniteEnseignement2);
        InscriptionUE inscription7 = new InscriptionUE(etudiant4, uniteEnseignement1);
        InscriptionUE inscription8 = new InscriptionUE(etudiant4, uniteEnseignement2);
        InscriptionUE inscription9 = new InscriptionUE(etudiant5, uniteEnseignement1);
        InscriptionUE inscription10 = new InscriptionUE(etudiant5, uniteEnseignement2);
        
        //Assigner les moyennes
        inscription1.assignerMoyenne((float) 17.5);
        inscription2.assignerMoyenne((float) 19.5);
        inscription3.assignerMoyenne((float) 14.5);
        inscription4.assignerMoyenne((float) 19.5);
        inscription5.assignerMoyenne((float) 16.5);
        inscription6.assignerMoyenne((float) 18.5);
        inscription7.assignerMoyenne((float) 15.5);
        inscription8.assignerMoyenne((float) 16.5);
        inscription9.assignerMoyenne((float) 17.5);
        inscription10.assignerMoyenne((float) 19.5);   
      
        //tableau 
        UniteEnseignement[] unitesEnseignements = {uniteEnseignement1, uniteEnseignement2};
        InscriptionUE[] inscriptions = {inscription1, inscription2, inscription3, inscription4, inscription5, inscription6,
                                        inscription7, inscription8, inscription9, inscription10};
        
        // Affichage des inscriptions pour toutes les UEs
        for (UniteEnseignement ue : unitesEnseignements) {
            System.out.println("**************** Liste des étudiants inscrits dans l'UE *****************");
            System.out.println("Code de l'UE : " + ue.getCodeUE());
            System.out.println("Intitulé de l'UE : " + ue.getIntituleUE());
            System.out.println("Nombre de crédits de l'UE : " + ue.getCoefficient());
            System.out.println("Les étudiants inscrits pour cette UE sont :\n");
            for (InscriptionUE inscription : inscriptions) {
                if (inscription.getUniteEnseignement().equals(ue)) {
                    System.out.println("Étudiant : " + inscription.getEtudiant().getNomEtudiant() + " "
                            + inscription.getEtudiant().getPrenomEtudiant() + " | Moyenne : " + inscription.getMoyenne() + "/20");
                }
            }
            System.out.println();
        }
        
        //Afficher les moyennes par ordre de merite
        Etudiant[] etudiants = {etudiant1, etudiant2, etudiant3, etudiant4, etudiant5};
        float[] moyennesGenerales = new float[etudiants.length];
        
        // Calculer la moyenne générale pour chaque étudiant
        for (int i = 0; i < etudiants.length; i++) {
            Etudiant etudiant = etudiants[i];
            float sommeMoyennesPonderees = 0;
            float sommeCoefficients = 0;
            
            // Calcul des moyennes pondérées pour chaque UE
            for (InscriptionUE inscription : inscriptions) {
                if (inscription.getEtudiant().equals(etudiant)) {
                    float moyenne = inscription.getMoyenne();
                    float coefficient = inscription.getUniteEnseignement().getCoefficient();
                    sommeMoyennesPonderees += moyenne * coefficient;
                    sommeCoefficients += coefficient;
                }
            }
            
            // Calcul de la moyenne générale
            moyennesGenerales[i] = sommeMoyennesPonderees / sommeCoefficients;
        }

        // Trier les étudiants par ordre de mérite (moyenne générale décroissante)
        for (int i = 0; i < etudiants.length - 1; i++) {
            for (int j = i + 1; j < etudiants.length; j++) {
                if (moyennesGenerales[i] < moyennesGenerales[j]) {
                    // Échanger les moyennes
                    float tempMoyenne = moyennesGenerales[i];
                    moyennesGenerales[i] = moyennesGenerales[j];
                    moyennesGenerales[j] = tempMoyenne;
                    
                    // Échanger les étudiants correspondants
                    Etudiant tempEtudiant = etudiants[i];
                    etudiants[i] = etudiants[j];
                    etudiants[j] = tempEtudiant;
                }
            }
        }

        // Affichage des étudiants triés par ordre de mérite
        System.out.println("**************** Liste des étudiants par ordre de mérite *****************");
        for (int i = 0; i < etudiants.length; i++) {
            System.out.println("Étudiant : " + etudiants[i].getNomEtudiant() + " " + etudiants[i].getPrenomEtudiant() + 
                               " | Moyenne Générale : " + moyennesGenerales[i] + "/20");
        }
        
        
        /*etudiant1.afficherEtudiant();
        etudiant2.afficherEtudiant();
        etudiant3.afficherEtudiant();
        etudiant4.afficherEtudiant();
        etudiant5.afficherEtudiant();*/        
        
    }
    
}
