import ptcbanco.*;
public class Principal{
	public static void main(String []args){
		Conta p1 = new Conta();
		System.out.println(Conta.getNume());	
		Conta p2 = new Conta();
		System.out.println(Conta.getNume());
		Conta p3 = new Conta("Martins","100000");
		System.out.println(Conta.getNume());
		p1.setId("Felipe");
		p1.setSaldo("1234");
		p2.setId("Roberto");
		p2.setSaldo("4321");
		p1.imprimirSaldo();
		p2.imprimirSaldo();
		p3.imprimirSaldo();
	}
}
