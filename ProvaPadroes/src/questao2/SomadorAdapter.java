package questao2;

import java.util.ArrayList;
import java.util.List;

public class SomadorAdapter implements SomadorEsperado{
	 
	
	SomadorExistente somador;
	
	public SomadorAdapter(SomadorExistente somador) {
		this.somador = somador;
	}

	@Override
	public int somaVetor(int[] vetor) {
		List<Integer> lista = new ArrayList<Integer>();
		for(int i: vetor) {
			lista.add(i);
		}
		
		 int soma = somador.somaLista(lista);
		 return soma;
	}
	 
}
