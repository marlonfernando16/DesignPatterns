package questao5;

import java.util.ArrayList;
import java.util.List;

public class Pasta extends ArquivoAbstracao {
	
	private List<ArquivoAbstracao> arquivos;
	
	public Pasta(String nome) {
		this.nome = nome;
		arquivos = new ArrayList<>();
	}

	@Override
	public void printNomeDoArquivo() {
		System.out.println(this.nome);
		for(ArquivoAbstracao a: arquivos) {
			a.printNomeDoArquivo();
		}
	}

	@Override
	public void adicionar(ArquivoAbstracao arq) throws Exception {
		this.arquivos.add(arq);
	}

	@Override
	public void remover(String nomeArquivo) throws Exception {
		for(ArquivoAbstracao arq: arquivos) {
			if(arq.getNome().equals(nomeArquivo)) {
				this.arquivos.remove(arq);
				return;
			}
		}
		throw new Exception("Não existe esse arquivo.");
	}
	
	

}
