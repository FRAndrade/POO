public class SaldoInsuficienteException extends RuntimeException{
	private int saldodaconta;
	public SaldoInsuficienteException(int saldodaconta){
		super("dai peidou");
	}
}
