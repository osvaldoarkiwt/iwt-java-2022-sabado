package listasmap;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

import listasSet.tarefaderevisao.Pokemon;

public class ComparatorPorTipoMap implements Comparator<Map.Entry<Integer,Pokemon>> {

	@Override
	public int compare(Entry<Integer, Pokemon> pokemon01, Entry<Integer, Pokemon> pokemon02) {
		
		int tipo = pokemon01.getValue().getTipo().compareToIgnoreCase(pokemon02.getValue().getTipo());
		
		if(tipo != 0) return tipo;
		
		return pokemon01.getValue().getNome().compareToIgnoreCase(pokemon02.getValue().getNome());
	}
}
