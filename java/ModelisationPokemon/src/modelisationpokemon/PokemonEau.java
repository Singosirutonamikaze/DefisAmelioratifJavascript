/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelisationpokemon;

/**
 *
 * @author DELL LATITUDE
 */
public class PokemonEau extends Pokemon{
    
    public PokemonEau(String nom, int hp, int atk) {
        super(nom, hp, atk);
    }

    @Override
    //Polymorphisme
    public void attaquer(PokemonPlante p) {
        double multiplicateur = 2.0;
        int degats = (int) (this.getAtk() * multiplicateur);
        System.out.println(this.getNom() + " attaque " + p.getNom() + " et inflige " + degats + " points de dégâts.");
    }
    
     @Override
    public void attaquer(PokemonEau p) {
        double multiplicateur = 0.5;
        int degats = (int) (this.getAtk() * multiplicateur);
        System.out.println(this.getNom() + " attaque " + p.getNom() + " et inflige " + degats + " points de dégâts.");
    }
    @Override
    public void attaquer(PokemonFeu p) {
        double multiplicateur = 0.5;
        int degats = (int) (this.getAtk() * multiplicateur);
        System.out.println(this.getNom() + " attaque " + p.getNom() + " et inflige " + degats + " points de dégâts.");
    }
    
    @Override
    public void attaquer(PokemonNormal p) {
        double multiplicateur = 1.0;
        int degats = (int) (this.getAtk() * multiplicateur);
        System.out.println(this.getNom() + " attaque " + p.getNom() + " et inflige " + degats + " points de dégâts.");
    }
    /*public void attaquer(Pokemon p) {
        double multiplicateur;

        if (p.getClass().getSimpleName().equals("PokemonPlante")) {
            multiplicateur = 2.0;
        } else if (p.getClass().getSimpleName().equals("PokemonFeu") || p.getClass().getSimpleName().equals("PokemonEau")) {
            multiplicateur = 0.5;
        } else {
            multiplicateur = 1.0;
        }
        int degats = (int) (this.getAtk() * multiplicateur);
        p.setHp(p.getHp() - degats);
        System.out.println(this.getNom() + " attaque " + p.getNom() + " et inflige " + degats + " points de dégâts.");
    }*/
    
}
