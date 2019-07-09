package questao3;

public class Test {
	public static void main(String[] args) {
		ImplementacaoRefrigerante coca_cola = new CocaCola();
		AbstracaoTamanho tamanho_pequeno = new TamanhoPequeno(coca_cola);
		AbstracaoTamanho tamanho_medio = new TamanhoMedio(coca_cola);
		AbstracaoTamanho tamanho_grande = new TamanhoGrande(coca_cola);
		tamanho_pequeno.beber();
		tamanho_medio.beber();
		tamanho_grande.beber();
		
		ImplementacaoRefrigerante guarana = new Guarana();
		tamanho_pequeno = new TamanhoPequeno(guarana);
		tamanho_medio = new TamanhoMedio(guarana);
		tamanho_grande = new TamanhoGrande(guarana);
		tamanho_pequeno.beber();
		tamanho_medio.beber();
		tamanho_grande.beber();
		
		ImplementacaoRefrigerante sprite = new Sprite();
		tamanho_pequeno = new TamanhoPequeno(sprite);
		tamanho_medio = new TamanhoMedio(sprite);
		tamanho_grande = new TamanhoGrande(sprite);
		tamanho_pequeno.beber();
		tamanho_medio.beber();
		tamanho_grande.beber();

	}
}
