package questao6;

import java.util.ArrayList;
import java.util.List;

public class Congresso {
	private String nome;

	private int totalAssentos;

	private List<ParticipanteComposite> participantes = new ArrayList<>();

	public Congresso(String nome, int totalAssentos) {
		this.nome = nome;
		this.totalAssentos = totalAssentos;
		participantes = new ArrayList();
	}

	public String getNome() {
		return nome;
	}

	public int getTotalAssentos() {
		return totalAssentos;
	}

	public int getTotalParticipantes() {
		int totalParticipantes = 0;

		for (ParticipanteComposite participante : participantes) {
			if (participante instanceof Individuo) {
				totalParticipantes++;
			} else if (participante instanceof Instituicao) {
				Instituicao instituicao = (Instituicao) participante;
				totalParticipantes += instituicao.getMembros().size();
			}
		}

		return totalParticipantes;
	}

	public void adicionarParticipante(ParticipanteComposite participante) {

		if (participante instanceof Individuo) {

			if (totalAssentos > participantes.size()) {
				participantes.add(participante);
			} else {
				throw new UnsupportedOperationException("Congresso não possui assentos livres!");
			}

		} else if (participante instanceof Instituicao) {

			Instituicao t = (Instituicao) participante;

			if (totalAssentos > participantes.size() + t.getMembros().size()) {
				participantes.add(participante);
			} else {
				throw new UnsupportedOperationException("Congresso não possui" + " quantidade de assentos livres que Instituição necessita!");
			}
		}
	}

	public void imprimeParticipantes() {
		System.out.println("      Listagem dos Participantes");
		for (ParticipanteComposite participante : participantes) {
			if (participante instanceof Individuo) {
				System.out.println(participante + " - Instituição: Sem Filiação");
			} else if (participante instanceof Instituicao) {
				Instituicao instituicao = (Instituicao) participante;
				instituicao.imprimeMembros();
			}
		}
	}

	@Override
	public String toString() {
		return this.nome + " - Assentos: " + this.totalAssentos
				+ " - Participantes: " + getTotalParticipantes();
	}

}
