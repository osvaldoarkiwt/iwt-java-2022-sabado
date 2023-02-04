package listas;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TesteListasString {

	public static void main(String[] args) {
		
		List<String> sala = Arrays.asList("Karen","Luiz","Ana","João",
							"Marta","Paulo","Pedro","Ana","Luiz","Zélia","Paulo","Miriam");
		
		Set<String> salaHash = new HashSet<>();
		
		Set<String> salaLinked = new LinkedHashSet<>();
		
		Set<String> salaTree = new TreeSet<>();

		salaHash.addAll(sala);
		
		salaLinked.addAll(sala);
		
		salaTree.addAll(sala);
		
		System.out.println(salaHash);
		
		System.out.println(salaLinked);
		
		System.out.println(salaTree);
	}
}
