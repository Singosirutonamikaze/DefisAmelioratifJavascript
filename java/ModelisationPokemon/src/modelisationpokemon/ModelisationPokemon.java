/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modelisationpokemon;

/**
 *
 * @author DELL LATITUDE
 */
public class ModelisationPokemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pokemon pokemonNormal = new PokemonNormal("Rattata", 30, 10);
        Pokemon pokemonFeu = new PokemonFeu("Salamèche", 40, 15);
        Pokemon pokemonEau = new PokemonEau("Carapuce", 50, 12);
        Pokemon pokemonPlante = new PokemonPlante("Bulbizarre", 35, 8);

        pokemonNormal.afficher();
        pokemonEau.afficher();
        pokemonFeu.afficher();
        pokemonPlante.afficher();
        
        //Attaque entre  pokemon
        
        // Attaques entre Pokémon
        pokemonEau.attaquer((PokemonFeu) pokemonFeu);   
        pokemonFeu.attaquer((PokemonPlante) pokemonPlante); 
        pokemonNormal.attaquer((PokemonFeu) pokemonFeu);
        pokemonEau.attaquer((PokemonPlante) pokemonPlante);   
        pokemonFeu.attaquer((PokemonFeu) pokemonFeu); 
        pokemonNormal.attaquer((PokemonEau) pokemonEau);
       
        
        
    }
    
}
