package questao7;

import java.util.ArrayList;
import java.util.List;

public class Linha implements Componente {
	private List<Componente> celulas = new ArrayList<Componente>();
	
	@Override
	public void imprimir() {

		//imprime a linha
		for(Componente c: celulas) {
			c.imprimir();
			//imprime a borda lateral
			
		}
		System.out.println(" ");
		int tamanho = (celulas.size() * 17)+ 5;
		char[] linha = new char[tamanho];
		for(int i = 0; i < tamanho; i++) {
			linha[i] = '-';
		}
		System.out.println(new String(linha));
	}
	public void adicionar(Componente c) {
		celulas.add(c);
	}

}
