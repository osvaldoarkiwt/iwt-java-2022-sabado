package loja.testes;

import java.util.Arrays;
import java.util.List;

public class Soma {
	
	public static Integer executa(int a, int b) {
		return a + b;
	}
	
	public static List<Integer> dobraAMeta(){
		
		 List<Integer> numeros = Arrays.asList(1,2,3,4,5);
		
		return numeros.stream().map(x -> x * 2).toList();
		
	}
}
