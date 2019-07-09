package questao4;

import java.util.ArrayList;
import java.util.List;

public abstract class ImplementacaoLista{
	
	protected List<String> lista;
	
	public ImplementacaoLista() {
		lista = new ArrayList<>();
	}
	
	public void add(String s) {
		lista.add(s);
	}

	public List<String> getLista() {
		return lista;
	}

	public void imprime_itens_lista() {}
}
