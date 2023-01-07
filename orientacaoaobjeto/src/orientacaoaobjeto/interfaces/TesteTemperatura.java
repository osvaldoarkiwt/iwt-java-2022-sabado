package orientacaoaobjeto.interfaces;

public class TesteTemperatura {

	public static void main(String[] args) {

		Temperatura fahrenheit = x -> (x*9/5)+32;
		
		Temperatura kelvin = x -> x + 273;
		
		System.out.println(converte(fahrenheit,100));

	}
	public static double converte(Temperatura escala, double celsius) {
		return escala.converte(celsius);
	}
}
