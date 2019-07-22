package questao9;

public abstract class Decorator implements Componente {
	public Componente componente;

	public Componente getComponente() {
		return componente;
	}

	public Decorator(Componente componente) {
		this.componente = componente;
	}	

}
