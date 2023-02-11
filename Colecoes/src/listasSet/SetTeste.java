package listasSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetTeste {

	public static void main(String[] args) {
	
		List<Integer> inteiros = Arrays.asList(37,3,4,5,99,10,351,20,19,1,37,99,0,11);
		
		List<Integer> inteiros2 = Arrays.asList(37,99,351,78);
		
		Set<Integer> numerosHash =new  HashSet<Integer>();
		
		Set<Integer> numerosLinked =new  LinkedHashSet<Integer>();
		
		Set<Integer> numerosTree =new  TreeSet<Integer>();

		numerosHash.addAll(inteiros);
		
		numerosLinked.addAll(inteiros);
		
		numerosTree.addAll(inteiros);
		
		System.out.println(numerosHash.toString());
		
		System.out.println(numerosLinked.toString());
		
		System.out.println(numerosTree.toString());	
		
		System.out.println(numerosHash.containsAll(inteiros2));
		
		for(Integer inteiro : inteiros2) {
			boolean contemNumero = numerosHash.contains(inteiro);
			
			if(!contemNumero) numerosHash.add(inteiro);
		}
		
		System.out.println(numerosHash.toString());
		
		System.out.println(numerosHash.containsAll(inteiros2));
		
		Iterator<Integer> it = numerosHash.iterator();
		int soma = 0;
		while(it.hasNext()) {soma+=it.next();}
		System.out.println(soma);
		
	}
}
