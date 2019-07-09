package questao4;

public class teste {

	public static void main(String[] args) {
		ImplementacaoLista imprime_numeros = new ImprimeNumeros();
		AbstracaoLista lista = new ListaOrdenada(imprime_numeros);
		lista.adicionar("tales");
		lista.adicionar("marlon");
		lista.adicionar("john");
		lista.imprimir();
		
		System.out.println("");
		
		ImplementacaoLista imprime_letras = new ImprimeNumeros();
		lista = new ListaNaoOrdenada(imprime_letras);
		lista.adicionar("tales");
		lista.adicionar("marlon");
		lista.adicionar("john");
		lista.imprimir();

		
	}

}
