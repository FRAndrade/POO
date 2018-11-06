package copadomundo;
public class jogador{
	private String nome;
	int numero;
	public jogador (int numero,String nome){
		this.numero=numero;
		this.nome=nome;
	}
	public void getnome() {
		return this.nome;
	} 
	public void getnumero() {
		return this.numero;
	} 
	public void printposicao() {
		System.out,println(nome + " " + numero);
	}
}
