package revisao.interfaces.funcionais;

import java.util.function.Function;

public class InterfacesFuncionais {

	public static void main(String[] args) {
	
		FiguraGeometrica quad = new Quadrado();
		FiguraGeometrica tri = new Triangulo();
		
		System.out.println(quad.calcula(10));
		System.out.println(tri.calcula(10));

		FiguraGeometrica quadFuncional = x -> x*4;
		FiguraGeometrica triFuncional = x -> x*3;
		
		System.out.println(quadFuncional.calcula(10));
		System.out.println(triFuncional.calcula(10));
		
		System.out.println(calculaArea(quadFuncional,10));
		System.out.println(calculaArea(triFuncional,10));
		System.out.println(calculaArea(x-> x*5,10));
		
		Function<Double, Double> calculaArea = d -> d *4;
		
		System.out.println(calculaArea.apply(10.0));
	}
	
	public static double calculaArea(FiguraGeometrica figura, double lado) {
		return figura.calcula(lado);
	}
}

interface FiguraGeometrica{
	public double calcula(double lado);
}

class Quadrado implements FiguraGeometrica{

	@Override
	public double calcula(double lado) {
		
		return 4 * lado;
	}
}

class Triangulo implements FiguraGeometrica{

	@Override
	public double calcula(double lado) {
		return 3 * lado;
	}
}
