package questao8;

import java.util.Date;

public class Log extends Interceptador {
	
	

	public Log(Componente componente) {
		super(componente);
		
	}

	@Override
	public void executarTarefa() {
		Date d = new Date();
		System.out.println(d.toString()+" mensagem de log");
		this.getComponente().executarTarefa();
		
		
	}

}
