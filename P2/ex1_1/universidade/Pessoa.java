package universidade;
public class Pessoa{
	private String nome;
	private String cpf;

	public void setNome(String nome){
		this.nome=nome;
	}

	public void setCpf(String cpf){
		this.cpf=cpf;
	}
	public String getCpf(){
		return this.cpf;
	}
	public String getNome(){
		return this.nome;
	}
}
