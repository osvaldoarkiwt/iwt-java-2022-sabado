package listasSet.tarefaderevisao;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreinadorPokemon {

	public static void main(String[] args) {
	
	Set<Pokemon> pokedex = new HashSet<>() {{
	
			add(new Pokemon("Pikachu","eletrico"));
			add(new Pokemon("Bulbassauro","planta"));
			add(new Pokemon("Charizard","fogo"));
			add(new Pokemon("Ninetales","fogo"));
			add(new Pokemon("Squirtle","agua"));
			add(new Pokemon("Charmander","fogo"));
			add(new Pokemon("Meawth","normal"));
			add(new Pokemon("Victreebel","planta"));
		}};
		
		Set<Pokemon> pokedex02 = new LinkedHashSet<>();
		
		pokedex02.addAll(pokedex);
		
		Set<Pokemon> pokedex03 = new TreeSet<>(new ComparatorPorTipo());
		
		pokedex03.addAll(pokedex02);
		
		for(Pokemon pokemon : pokedex03) System.out.println(pokemon);		
	}
}