public class TestaCondicional2 {
    public static void main(String[] args) {
        System.out.println("Testando condicionais...");
        int idade = 20;
        int quantidadeDePessoas = 3;
        
        // boolean acompanhado = quantidadePessoas >= 2;
        
        boolean acompanhado;
        
        if (quantidadeDePessoas >= 2) {
        	acompanhado = true;
        } else {
        	acompanhado = false;
        }

        System.out.println("Valor do acompanhado = " + acompanhado);
        
        if (idade >= 18 && acompanhado) {
            System.out.println("Seja bem vindo!");
        } else {
        	System.out.println("Infelizmente você não pode entrar!");
        }
    }
}