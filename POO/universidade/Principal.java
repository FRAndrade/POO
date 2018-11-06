package banco;
import programa.Pessoa;
public class Principal{
	public static void main(String [] args){
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		p1.setnome("José");
		p1.setcpf("345");
		p2.setnome("Ronaldo");
		p2.setcpf("452");
		System.out.println(p1.getnome());
		System.out.println(p1.getcpf());
		System.out.println(p2.getnome());
		System.out.println(p2.getcpf());
	}
}
