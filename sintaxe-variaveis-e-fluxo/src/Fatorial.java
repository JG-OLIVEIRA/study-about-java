public class Fatorial {
	public static void main(String[] args) {
		for(int n = 1; n <= 10; n++) {
			int fatorial = 1;
			int multiplicador = 1;
			
			while(multiplicador <= n){
				fatorial = fatorial * multiplicador;
				multiplicador++;
			}
			
			System.out.println(n + "! = " + fatorial);
		}
	}
}
