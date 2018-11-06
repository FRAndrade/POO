public class Principal{
	public static void main(String [] args) throws Exception {
		int i =0;
		int j = 0;
		while(i<100){
		try{
		System.out.println(j);
		Erros erro = new Erros();
		erro.fazerro();
		}
		catch(vaiti e){
			System.out.println(e);
		}
		i++;
		j++;
		}
	}
}
