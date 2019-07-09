package questao4;

public class ImprimeMarcadores extends ImplementacaoLista{

	@Override
	public void imprime_itens_lista() {
		for(String item: lista) {
			System.out.println(item + " " + "-");
		}
	}
}
