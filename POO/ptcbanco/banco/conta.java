package banco;
public class conta{
	private String id,saldo;
	public void setid(String id){
		this.id = id;
	}
	public void setsaldo(String saldo){
		this.saldo = saldo;
	}
	public void imprimirSaldo(){
		System.out.println(this.id);
		System.out.println(this.saldo);
	}
}
