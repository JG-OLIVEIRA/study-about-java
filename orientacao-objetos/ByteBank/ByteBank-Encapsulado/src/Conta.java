public class Conta {
	private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;
    
    public Conta(int agencia, int numero) {
    	total++;
    	this.agencia = agencia;
    	this.numero = numero;
    	System.out.println("Estou criando uma conta " + this.numero);
    }
    
    public void deposita(double valor){
    	this.saldo += valor;
    }
    
    public boolean saca(double valor) {
    	if(this.saldo >= valor) {
    		this.saldo -= valor;
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public boolean transfere(double valor, Conta destino) {
    	if(this.saldo >= valor) {
    		this.saldo -= valor;
    		destino.deposita(valor);
    		return true;
    	}
    	return false;
    }
    
    public double getSaldo() {
    	return this.saldo;
    }
    
    public Cliente getTitular() {
		return titular;
	}
    
    public int getNumero() {
    	return this.numero;
    }
    
    public int getAgencia() {
		return this.agencia;
	}   
    
    public static int getTotal() {
		return Conta.total;
	}
    
    public void setTitular(Cliente titular) {
    	this.titular = titular;
    }
    
    public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
    
    public void setNumero(int numero) {
		this.numero = numero;
	}
}