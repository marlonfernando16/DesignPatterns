package questao8;

import java.util.Calendar;
import java.util.Date;

public class VerificadorDeMinuto extends Interceptador {

	public VerificadorDeMinuto(Componente componente) {
		super(componente);
		
	}
	
	@Override
	public void executarTarefa() {
		Calendar calendar = Calendar.getInstance();
		int minutes = calendar.get(Calendar.MINUTE);
		if(minutes % 2 == 0) {
			System.out.println("Execução interrompida em minuto par , minuto = "+minutes);
			System.exit(1);
		}
		this.getComponente().executarTarefa();
		
		
	}

}
