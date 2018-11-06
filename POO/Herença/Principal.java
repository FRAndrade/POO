public class Principal{
	public static void main(String[] args){
	Professor p1 = new Professor();
	Pessoa p2 = new Professor();
	p1.setNome("FR");
	p1.setSala("68");
	p2.setNome("MA");
	System.out.println(p1.getNome() + " " + p1.getSala());
	System.out.println(p2.getNome());
	}
}
