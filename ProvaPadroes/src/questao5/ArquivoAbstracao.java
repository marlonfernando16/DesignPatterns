package questao5;

public abstract class ArquivoAbstracao {
	
	protected String nome;

	public void printNomeDoArquivo() {
		System.out.println(nome);
	}
	
	public void adicionar(ArquivoAbstracao arq) throws Exception {
		throw new Exception("Não pode inserir arquivos em " + this.nome);
	}
	
	public void remover(String nomeArquivo) throws Exception {
		throw new Exception("Não pode remover arquivos, não eh uma pasta");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
