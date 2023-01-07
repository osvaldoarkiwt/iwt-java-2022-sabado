package orientacaoaobjeto.interfaces;

public class TesteInterfaces {

	public static void main(String[] args) {
		
		InterfaceFuncional soma = (a, b)-> a+b;

		InterfaceFuncional subtracao = (a, b)-> a-b;
		
		InterfaceFuncional multiplicacao = (a, b)-> a*b;
		
		InterfaceFuncional divisao = (a, b)-> a/b;
		
		System.out.println(executa(soma,6,50));
		
		System.out.println(soma.calcula(11, 55));
		System.out.println(subtracao.calcula(11, 55));
		System.out.println(multiplicacao.calcula(11, 55));
		System.out.println(divisao.calcula(11, 55));
	}

	public static int executa(InterfaceFuncional nome, int a, int b) {
		return nome.calcula(a, b);
	}
	
	public static int executaGen(InterfaceFuncionalGenerica<Integer> nome, int a, int b) {
		return nome.calculaGen(a, b);
	}
	
	public static double executaGen(InterfaceFuncionalGenerica<Double> nome, double a, double b) {
		return nome.calculaGen(a, b);
	}
}
