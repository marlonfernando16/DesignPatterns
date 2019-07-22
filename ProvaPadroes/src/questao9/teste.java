package questao9;

public class teste {
	public static void main(String[] args) {
		new Colchetes(new Parenteses(new Numero1())).imprimir();
		System.out.println(" ");
		System.out.println("---------------------------------");
		new Parenteses(new Colchetes(new Numero1())).imprimir();
	}

}
