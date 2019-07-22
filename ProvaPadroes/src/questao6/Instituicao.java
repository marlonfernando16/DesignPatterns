package questao6;

import java.util.ArrayList;
import java.util.List;

public class Instituicao implements ParticipanteComposite {
	private String nome;
	 
    private List<ParticipanteComposite> membros = new ArrayList<>();
 
    public Instituicao(String nome) {
        this.nome = nome;
        membros = new ArrayList();
    }
 
    
    public void adicionar(ParticipanteComposite participante) {
        membros.add(participante);
    }
 
    
    public void remover(ParticipanteComposite participante) {
        membros.remove(participante);
    }
 
 
    public ParticipanteComposite getFilho(int index) {
        return (ParticipanteComposite) membros.get(index);
    }
 
    @Override
    public String getNome() {
        return nome;
    }
 
    public List getMembros() {
        return membros;
    }
 
    @Override
    public String toString() {
        return "Instituição: " + this.nome;
    }
 
    public void imprimeMembros() {
       for (ParticipanteComposite membro : membros) {
          System.out.println(membro + " - Instituição: " + this.nome);
       }
    }
}


