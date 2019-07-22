package questao8;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class teste {
	public static void main(String[] args) {
		new Interceptador(new Log(new VerificadorDeMinuto(new Cronometro(new ComponenteConcreto())))).executarTarefa();
	}

}
