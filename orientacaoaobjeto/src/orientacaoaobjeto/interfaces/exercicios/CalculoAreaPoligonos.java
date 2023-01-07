package orientacaoaobjeto.interfaces.exercicios;

public class CalculoAreaPoligonos {

	public static void main(String[] args) {
		
		AreaPoligonos triangulo = (x) ->{ return Math.pow(x, 2) * Math.sqrt(3) /4; };

		AreaPoligonos quadrado = x -> Math.pow(x, 2);
		
		AreaPoligonos pentagono = x -> 5 * Math.pow(x, 2) / 4 * Math.tan(36);
		
		AreaPoligonos hexagono = x -> 3 * Math.pow(x, 2) * (Math.sqrt(3)/2);

	}

	public static double calculaArea(AreaPoligonos areaPol, int lado) {
		return areaPol.area(lado);
	}
	
}
