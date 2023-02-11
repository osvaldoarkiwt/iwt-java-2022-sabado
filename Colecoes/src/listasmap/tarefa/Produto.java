package listasmap.tarefa;

import java.util.HashMap;
import java.util.Map;

public class Produto {

	public static void main(String[] args) {
		Map<String,Double> produtos = new HashMap<>();

		produtos.put("café", 8.60);
		produtos.put("leite", 6.50);
		produtos.put("arroz", 5.10);
		produtos.put("feijão", 8.10);
		produtos.put("chocolate", 5.10);
		
		for(String chave : produtos.keySet()) {
			System.out.println(chave+" : "+produtos.get(chave));
		}
		
		for(Map.Entry<String, Double> item : produtos.entrySet()) {
			
			String sf2=String.format("R$ %.2f",item.getValue());  
			
			System.out.println(item.getKey()+" : "+sf2);
		}
	}
}
