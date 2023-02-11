package listasSet.tarefaderevisao;

import java.util.Objects;

public class Pokemon implements Comparable<Pokemon> {

	private String nome;
	private String tipo;
	
	public Pokemon(String nome, String tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(tipo, other.tipo);
	}

	@Override
	public String toString() {
		return "Pokemon [nome=" + nome + ", tipo=" + tipo + "]";
	}

	@Override
	public int compareTo(Pokemon pokemon) {
		
		return this.getNome().compareToIgnoreCase(pokemon.getNome());
	}
}
