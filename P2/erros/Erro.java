public class Erro extends Exception{
	private int numero;
	public Erro(int numero){
		super("Deu erro caralho");
		this.numero=numero;
	}
	public String getMenssage(){
		return "errou";
	}
	public String getMenssage1(){
		return "errou de novo";
	}
}
