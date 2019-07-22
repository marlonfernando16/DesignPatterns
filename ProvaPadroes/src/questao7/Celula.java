package questao7;

public class Celula implements Componente {
	
	private String conteudo;
	
	public Celula(String conteudo) {
		this.conteudo = conteudo;
	}
	
	public static String padRight(String s, int n) {
	     return String.format("%-" + n + "s", s);  
	}
	
	@Override
	public void imprimir() {
		//limita o conteudo a 15 characteres
		conteudo = conteudo + " ";
		//imprime na mesma linha e com borda lateral
		System.out.print(" | "+padRight(conteudo, 15));
	}

}
