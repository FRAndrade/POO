package ptcbanco;
public class Conta{
	private	static int nume = 0;
	private String id;
	private String saldo;
	public Conta (){
		nume++;
	}
	public Conta (String id, String saldo){
		this.id=id;
		this.saldo=saldo;
		nume++;
	}
	public void setId(String id){
		this.id=id;
	}
	public void setSaldo(String saldo){
		this.saldo=saldo;
	}
	private String getSaldo(){
		return this.saldo;
	}
	private String getId(){
		return this.id;
	}
	public static int getNume(){
		return nume;
	}
	public void imprimirSaldo(){
		System.out.println(getId());
		System.out.println(getSaldo());
	}
}
