package questao7;

public class teste {
	public static void main(String[] args) {
		
		Componente comp1 = new Celula("time");
		Componente comp2 = new Celula("pontos");
		Componente comp3 = new Celula("sao paulo");
		Componente comp4 = new Celula("22");
		Componente comp5 = new Celula("palmeiras");
		Componente comp6 = new Celula("19");
		Componente comp7 = new Celula("corinthians");
		Componente comp8 = new Celula("20");

		Linha linha1 = new Linha();
		Linha linha2 = new Linha();
		Linha linha3 = new Linha();
		Linha linha4 = new Linha();

		linha1.adicionar(comp1);
		linha1.adicionar(comp2);

		linha2.adicionar(comp3);
		linha2.adicionar(comp4);

		linha3.adicionar(comp5);
		linha3.adicionar(comp6);

		linha4.adicionar(comp7);
		linha4.adicionar(comp8);

		Tabela tabela = new Tabela();
		
		tabela.adicionar(linha1);
		tabela.adicionar(linha2);
		tabela.adicionar(linha3);
		tabela.adicionar(linha4);
		tabela.imprimir();


	}

}
