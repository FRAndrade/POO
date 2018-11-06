public class Pricipal{
	public static void main(String [] args){
		try{
		amigos <String> p1 = new amigos<String>("Car",19);
		p1.imprime(1);
		}catch(Erro e){
			System.out.println(e.getMenssage());
			System.out.println(e.getMenssage1());
		}
	}
}
