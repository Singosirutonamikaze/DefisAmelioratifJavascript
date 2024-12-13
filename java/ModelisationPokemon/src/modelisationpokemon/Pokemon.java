/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelisationpokemon;

/**
 *
 * @author DELL LATITUDE
 */
abstract class Pokemon {
    protected String nom;
    protected int hp;
    protected int atk;
    
    //Constructeur d'initialisation

    public Pokemon(String _nom, int _hp, int _atk) {
        this.nom = _nom;
        this.hp = _hp;
        this.atk = _atk;
    }
    
    
    //Les accesseurs getters
    public String getNom() {
        return nom;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }
    
    //Les accesseurs setters
    public void setNom(String _nom) {
        this.nom = _nom;
    }

    public void setHp(int _hp) {
        this.hp = _hp;
    }

    public void setAtk(int _atk) {
        this.atk = _atk;
    }
    
    //Methode pour verifier si le pokemon est mort
    public boolean isDead(){
        if( hp == 0){
            System.out.println("Le pokémon est mort");
            return true;
        }else{
            return false;
        }
    }
    
    // Méthode abstraite attaquer
    //public abstract void attaquer(Pokemon p);
    
    //polymorphisme
    public abstract void attaquer(PokemonNormal p);
    public abstract void attaquer(PokemonEau p);
    public abstract void attaquer(PokemonFeu p);
    public abstract void attaquer(PokemonPlante p);
    
    //Methode Afficher pour afficher le Pokemon
    public void afficher() {
        System.out.println("********* Information Du Pokemon ***********");
        System.out.println("Nom du Pokémon : " + this.nom);
        System.out.println("Force de base : " + this.atk);
        System.out.println("Health Points : " + this.hp);
        System.out.println();
    }

}
