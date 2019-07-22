package questao8;

public class ComponenteConcreto implements Componente {

	@Override
	public void executarTarefa() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
