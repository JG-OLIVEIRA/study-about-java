public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		segundaConta.saldo += 100;
		System.out.println("Saldo da segunda: " + segundaConta.saldo);
		
		System.out.println(primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("É a mesma conta");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
