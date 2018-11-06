import universidade.*;
public class Principal{
	public static void main(String []args){
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		p1.setNome("Felipe");
		p2.setNome("Roberto");
		System.out.println(p1.getNome());
		System.out.println(p2.getNome());
	}
}
