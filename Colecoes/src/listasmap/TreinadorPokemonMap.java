package listasmap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;

import listasSet.tarefaderevisao.Pokemon;

public class TreinadorPokemonMap {

	public static void main(String[] args) {

		Map<Integer, Pokemon> pokedex = new HashMap<>() {
			{
				put(25, new Pokemon("pikachu", "eletrico"));
				put(6, new Pokemon("charizard", "fogo"));
				put(1, new Pokemon("bulbassauro", "planta"));
				put(7, new Pokemon("squirtle", "agua"));
				put(4, new Pokemon("charmander", "fogo"));
				put(38, new Pokemon("ninetales", "fogo"));
				put(71, new Pokemon("victreebel", "planta"));
			}
		};

		Map<Integer, Pokemon> pokedex02 = new LinkedHashMap<>() {
			{
				put(25, new Pokemon("pikachu", "eletrico"));
				put(6, new Pokemon("charizard", "fogo"));
				put(1, new Pokemon("bulbassauro", "planta"));
				put(7, new Pokemon("squirtle", "agua"));
				put(4, new Pokemon("charmander", "fogo"));
				put(38, new Pokemon("ninetales", "fogo"));
				put(71, new Pokemon("victreebel", "planta"));
			}
		};

		// pokedex02.putAll(pokedex);

		for (Map.Entry<Integer, Pokemon> pokemons : pokedex02.entrySet()) {
			System.out.println(
					pokemons.getKey() + "-" + pokemons.getValue().getNome() + "/" + pokemons.getValue().getTipo());
		}

		Set<Map.Entry<Integer, Pokemon>> teste = new TreeSet<>(new Comparator<Map.Entry<Integer, Pokemon>>() {

			@Override
			public int compare(Entry<Integer, Pokemon> pokemon01, Entry<Integer, Pokemon> pokemon02) {
				int tipo = pokemon01.getValue().getTipo().compareToIgnoreCase(pokemon02.getValue().getTipo());

				if (tipo != 0)
					return tipo;

				return pokemon01.getValue().getNome().compareToIgnoreCase(pokemon02.getValue().getNome());
			}

		});

		Set<Map.Entry<Integer, Pokemon>> teste02 = new TreeSet<>(
				Comparator.comparing(new Function<Map.Entry<Integer, Pokemon>, String>() {
					public String apply(Map.Entry<Integer, Pokemon> pokemon) {

						return pokemon.getValue().getTipo();
					}
				}));

		
		Set<Map.Entry<Integer, Pokemon>> teste03 = new TreeSet<>((pokemon01, pokemon02) -> {
			int result = pokemon01.getValue().getTipo().compareToIgnoreCase(pokemon02.getValue().getTipo());
			if (result == 0) {
				result = pokemon01.getValue().getNome().compareToIgnoreCase(pokemon02.getValue().getNome());
			}
			return result;
		});
		
		
		// Set<Map.Entry<Integer,Pokemon>> teste = new TreeSet<>(new
		// ComparatorPorTipoMap());

		teste03.addAll(pokedex.entrySet());

		for (Map.Entry<Integer, Pokemon> teste01 : teste03) {
			System.out.println(teste01.getKey() + ": " + teste01.getValue());
		}

	}
}