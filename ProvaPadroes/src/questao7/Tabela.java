package questao7;

import java.util.ArrayList;
import java.util.List;

public class Tabela {
	private List<Componente> linhas = new ArrayList<Componente>();
	
	public void adicionar(Componente c) {
		linhas.add(c);
	}
	
	public void imprimir() {
		for(Componente c: linhas) {
			c.imprimir();
			//imprime a borda lateral
			
		}
	}
	

}
