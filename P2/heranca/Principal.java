public class Principal{
	public static void main(String []args){
		Pessoa p1 = new Pessoa("FR");
		Pessoa p2 = new Professor("608-1","Andrade");
		Pessoa p3 = new Aluno("Informação","Martins");
		System.out.println(p1.getDados());
		System.out.println(p2.getDados());
		System.out.println(p2);
		System.out.println(p3.getDados());
	}
}
