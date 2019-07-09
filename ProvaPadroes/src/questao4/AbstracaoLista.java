package questao4;

public abstract class AbstracaoLista {
	protected ImplementacaoLista lista;
	
	public AbstracaoLista(ImplementacaoLista lista) {
		this.lista = lista;
	}
	
	public abstract void adicionar(String s);
	public abstract void imprimir();
}
