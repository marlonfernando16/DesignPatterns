package questao9;

public class Parenteses extends Decorator {

	public Parenteses(Componente componente) {
		super(componente);
		
	}

	@Override
	public void imprimir() {
		System.out.print("(");
		this.componente.imprimir();
		System.out.print(")");
		
	}
	

}
