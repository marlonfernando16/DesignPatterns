package questao4;

import java.util.List;

public class ImprimeNumeros implements ImplementacaoLista<Integer>{

	@Override
	public void imprime_itens_lista(List<Integer> lista) {
		for(int item: lista) {
			System.out.println(item);
		}
	}

}
