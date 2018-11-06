public class SaldoInsuficienteException extends Exception{
	private double saldo;
	public SaldoInsuficienteException(double saldo){
		this.saldo=saldo;
	}
	public String getMessage(){
		return "Saldo da conta eh insuficiente";
	}
	public double getSaldo(){
		return saldo;
	}
}
