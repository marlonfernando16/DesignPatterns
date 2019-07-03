package questao2;

public class teste {
	public static void main(String[] args) {
		SomadorExistente existente = new SomadorExistente();
		SomadorAdapter somador = new SomadorAdapter(existente);
		Cliente cliente = new Cliente(somador);
		cliente.executar();
	}
}
