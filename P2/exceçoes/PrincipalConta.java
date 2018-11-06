public class PrincipalConta {
	public static void main(String[] args) {
			Conta conta1 = new Conta("Pessoa teste");
			conta1.depositar(100);
			conta1.sacar(20);
			conta1.setLimite(100);
			System.out.println(conta1);
			conta1.sacar(180);
			System.out.println(conta1);
			conta1.sacar(1);
	}

}
