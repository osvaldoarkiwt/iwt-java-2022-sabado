package loja.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;


public class TestaSoma {
	
	@Test
	public void TestaSoma() {
		
		assertEquals(23, new Soma().executa(19, 4));
	}
	
	@Test
	public void TestaLista() {
		
		assertEquals(Arrays.asList(2,4,6,8,10),new Soma().dobraAMeta());
	}
}
