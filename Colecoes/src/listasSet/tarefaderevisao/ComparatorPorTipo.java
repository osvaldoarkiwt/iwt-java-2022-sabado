package listasSet.tarefaderevisao;

import java.util.Comparator;

public class ComparatorPorTipo implements Comparator<Pokemon>{

	@Override
	public int compare(Pokemon o1, Pokemon o2) {
		
		int tipo = o1.getTipo().compareToIgnoreCase(o2.getTipo());
		
		if(tipo != 0) return tipo;
		
		return o1.getNome().compareToIgnoreCase(o2.getNome());
	}
}
