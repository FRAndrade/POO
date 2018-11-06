public class Conta{
	private String id,saldo;
	public void imprimirSaldo(){
		System.out.println(this.id);
		System.out.println(this.saldo);
	}
	public Conta(String id,String saldo){
		this.id = id;		
		this.saldo = saldo;
		System.out.println("Conta criada");	
		imprimirSaldo();
	}
	public void setid(String id){
		this.id = id;
	}
	public void setsaldo(String saldo){
		this.saldo = saldo;
	}
}
