public class Conta{
	private String nome;
	private int saldo;
	private int limite=0;
	public Conta(String nome){
		this.nome=nome;
	}
	public void depositar ( int deposito ) {
		saldo+= deposito;
	}
	public void sacar ( int saque ) {
		if(saque > limite + saldo){
			throw new SaldoInsuficienteException(limite + saldo); 
			
		}
		saldo-= saque;
	}
	public void setLimite ( int limite ) {
		this.limite = limite;
	}
	@Override
	public String toString(){
		return nome + " tem " + saldo;
	}
	
}
