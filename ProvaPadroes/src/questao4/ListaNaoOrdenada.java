package questao4;

public class ListaNaoOrdenada extends AbstracaoLista{

	public ListaNaoOrdenada(ImplementacaoLista lista) {
		super(lista);
	}
	
	@Override
	public void adicionar(String s) {
		System.out.println("adicionando na nao ordenada");
		lista.add(s);
	}

	@Override
	public void imprimir() {
		System.out.println("imprimindo na nao ordenada");
		lista.imprime_itens_lista();
	}

}
