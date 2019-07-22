package questao6;

public class teste {
	public static void main(String[] args) {
		  Congresso congresso = new Congresso("Congresso", 4);
	      
		  ParticipanteComposite marlon = new Individuo("Marlon", 2);
	      ParticipanteComposite Tales = new Individuo("Tales", 1);
	 
	      congresso.adicionarParticipante(marlon);
	      congresso.adicionarParticipante(Tales);
	 
	      ParticipanteComposite john = new Individuo("John", 5);
	 
	      Instituicao partidoIFPB = new Instituicao("partidoIFPB");
	      partidoIFPB.adicionar(john);
	 
	      congresso.adicionarParticipante(partidoIFPB);
	 
	      System.out.println(congresso);
	      congresso.imprimeParticipantes();
	}

}
