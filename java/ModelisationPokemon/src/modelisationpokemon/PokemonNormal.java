/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelisationpokemon;

/**
 *
 * @author DELL LATITUDE
 */
public class PokemonNormal extends Pokemon{
    
    public PokemonNormal(String _nom, int _hp, int _atk) {
        super(_nom, _hp, _atk);
    }
    
    @Override
    public void attaquer(PokemonNormal p) {
        p.setHp(p.getHp() - this.getAtk());
        System.out.println(this.getNom() + " attaque " + p.getNom() + " et inflige " + this.getAtk() + " points de dégâts.");
    }
    
    @Override
    public void attaquer(PokemonEau p) {
        p.setHp(p.getHp() - this.getAtk());
        System.out.println(this.getNom() + " attaque " + p.getNom() + " et inflige " + this.getAtk() + " points de dégâts.");
    }
    
    @Override
    public void attaquer(PokemonFeu p) {
         p.setHp(p.getHp() - this.getAtk());
        System.out.println(this.getNom() + " attaque " + p.getNom() + " et inflige " + this.getAtk() + " points de dégâts.");
    }
    
    @Override
    public void attaquer(PokemonPlante p) {
         p.setHp(p.getHp() - this.getAtk());
        System.out.println(this.getNom() + " attaque " + p.getNom() + " et inflige " + this.getAtk() + " points de dégâts.");
    }
    
    /*public void attaquer(Pokemon p) {
        p.setHp(p.getHp() - this.getAtk());
        System.out.println(this.getNom() + " attaque " + p.getNom() + " et inflige " + this.getAtk() + " points de dégâts.");
    }*/
}
