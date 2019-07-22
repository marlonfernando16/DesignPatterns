package questao6;

public class Individuo implements ParticipanteComposite{
    private String nome;
    
    private int assento;
    
    public Individuo(String nome, int assento) {
        this.nome = nome;
        this.assento = assento;
    }
    
	@Override
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
        this.nome = nome;
    }
 
    public int getAssento() {
        return assento;
    }
 
    public void setAssento(int assento) {
        this.assento = assento;
    }
 
    @Override
    public String toString() {
        return "Nome: " + this.nome + " - Assento: " + this.assento;
    }

	

}
