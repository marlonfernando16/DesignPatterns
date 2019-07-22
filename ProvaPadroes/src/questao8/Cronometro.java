package questao8;

public class Cronometro extends Interceptador {

	public Cronometro(Componente componente) {
		super(componente);
	}

	@Override
	public void executarTarefa() {
		
		for(int i=1; i<=5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.getComponente().executarTarefa();
		
	}
	

}
