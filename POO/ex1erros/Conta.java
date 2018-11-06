public class Conta{
	private String titular;
	private double saldo=0;
	private double limite=0;
	private double debito;
	public Conta(String titular){
		this.titular=titular;
	}
	public void depositar(int valor){
		saldo +=valor;
	}
	public void sacar(int valor) throws SaldoInsuficienteException{
		if(saldo + limite < valor) throw new SaldoInsuficienteException(saldo + limite);
		saldo -=valor;
	}
	public void setLimite(int valor){
		limite = valor;
	}
	@Override 
	public String toString(){
		return titular + " tem " + saldo; 
	}
}
