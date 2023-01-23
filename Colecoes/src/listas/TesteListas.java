package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TesteListas {

	public static void main(String[] args) {
		
		Integer[] numeros = {1,2,3,4,5,6,7,8,9};
		
		List<Integer> lista01 = new ArrayList<>();
		
		//List<Integer> lista02 = Arrays.asList(numeros);
		
		List<Integer> lista = new ArrayList<>(Arrays.asList(numeros));
		
		lista.add(10);
		
		//System.out.println(lista);
		
		Iterator<Integer> it = lista.iterator();
		
		int soma = 0;
		
		while(it.hasNext()) {
			
			soma+=it.next();
			
			//if(it.next() % 2 != 0) it.remove();			
		}
		
		System.out.println(soma);
		
		System.out.println(Collections.min(lista));
		System.out.println(Collections.max(lista));
	}
}
