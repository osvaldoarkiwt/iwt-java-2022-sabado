package listasSet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class SetObjeto {

	public static void main(String[] args) {
		
		List<Aluno> sala = new ArrayList<>() {{
			add(new Aluno("José",20,"Javascript"));
			add(new Aluno("João",18,"Javascript"));
			add(new Aluno("Ana",18,"Java"));
			add(new Aluno("Marcelo",32,"Python"));
			add(new Aluno("Larissa",25,"Java"));
			add(new Aluno("Ana",18,"Javascript"));
			add(new Aluno("José",19,"Javascript"));
		}};

		
		Set<Aluno> salaHash = new HashSet<>();
		
		salaHash.addAll(sala);
		
		Set<Aluno> salaTree = new TreeSet<>(new ComparatorNomeIdadeCurso());
		
		salaTree.addAll(salaHash);
		
		System.out.println(salaTree);	
	}
}

class Aluno implements Comparable<Aluno>{
	
	private String nome;
	private Integer idade;
	private String curso;
	
	public Aluno(String nome, Integer idade, String curso) {
		this.nome = nome;
		this.idade = idade;
		this.curso = curso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public int hashCode() {
		return Objects.hash(curso, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(curso, other.curso) && Objects.equals(idade, other.idade)
				&& Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", curso=" + curso + "]\n";
	}

	@Override
	public int compareTo(Aluno aluno) {
		
		return this.getNome().compareToIgnoreCase(aluno.getNome());
	}
}

class ComparatorNomeIdadeCurso implements Comparator<Aluno>{

	@Override
	public int compare(Aluno aluno1, Aluno aluno2) {
		
		int nome = aluno1.getNome().compareToIgnoreCase(aluno2.getNome());
		
		if(nome != 0) return nome;
		
		int idade = aluno1.getIdade().compareTo(aluno2.getIdade());
		
		if(idade != 0) return idade;
		
		return aluno1.getCurso().compareToIgnoreCase(aluno2.getCurso());
	}
}

