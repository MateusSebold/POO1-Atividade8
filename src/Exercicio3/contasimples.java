package Exercicio3;

public class contasimples extends conta {
	
	private double saldopoupanca;
	
	public contasimples(String banco, int agencia, int numeroconta, double saldo) {
		super(banco,agencia,numeroconta,saldo);
	}
	
	public contasimples(String string, int i, int j, int k) {
		
	}

	public double getSaldopoupanca() {
		return saldopoupanca;
	}

	public void setSaldopoupanca(double saldopoupanca) {
		this.saldopoupanca = saldopoupanca;
	}
	
	public boolean depositoPoupanca(double valor) {
		if (valor > 0) {
			setSaldopoupanca(getSaldopoupanca()+valor);
			return true;
		}
		return false;
	}
	
	public boolean saquePoupanca(double valor) {
		if (valor <= getSaldopoupanca() && valor > 0) {
			setSaldopoupanca(getSaldopoupanca() - valor);
			return true;
		}
		return false;	
	}
	
	// Esse m�todo n�o est� no Diagrama de Classe, s� coloquei como exemplo
	public double total() {
		return getSaldo() + getSaldopoupanca();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldopoupanca=");
		builder.append(saldopoupanca);
		builder.append(", total()=");
		builder.append(total());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
