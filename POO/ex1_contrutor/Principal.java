public class Principal{
	public static void main(String[] args)throws Exception{
		PlanoDeensino p1 = new PlanoDeensino();
		PlanoDeensino p2 = new PlanoDeensino(5);
		PlanoDeensino p3 = new PlanoDeensino(5,"POO");
		Aula a1 = new Aula("PDS");
		p2.adicionarAula(a1);
		for(int i = 0; i<5;i++) p3.adicionarAula("SCI "+i);
		p2.imprimeAula();
		p3.imprimeAula();
		System.out.println(PlanoDeensino.getqte());
	}
}
