package listasmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RevisaoMap {

	public static void main(String[] args) {
	
		Map<Integer,String> alunos = new HashMap<>();

		alunos.put(1, "Annie");
		alunos.put(2, "Allan");
		alunos.put(3, "Isaac");
		alunos.put(4, "Dailes");
		alunos.put(5, "Livia");
		alunos.put(6, "PauloJ");
		alunos.put(7, "PauloS");
		alunos.put(8, "Rui");
		
		for(Integer chave : alunos.keySet()) {
			System.out.println(chave+" : "+alunos.get(chave));
		}
		
		for(Map.Entry<Integer, String> item : alunos.entrySet()) {
			System.out.println(item.getKey()+" : "+item.getValue());
		}
	}
}