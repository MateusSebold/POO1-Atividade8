package Exercicio3;

public class contaespecial extends conta{
	private double saldopoupanca;
	
	public contaespecial(String banco, int agencia, int numeroconta, double saldo) {
		super(banco,agencia,numeroconta,saldo);
	}
	
	public contaespecial() {
		
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
	private int diassemjuros;
	private double limite;

	public int getDiassemjuros() {
		return diassemjuros;
	}

	public void setDiassemjuros(int diassemjuros) {
		this.diassemjuros = diassemjuros;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("contaespecial [saldopoupanca=");
		builder.append(saldopoupanca);
		builder.append(", diassemjuros=");
		builder.append(diassemjuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", getSaldopoupanca()=");
		builder.append(getSaldopoupanca());
		builder.append(", getDiassemjuros()=");
		builder.append(getDiassemjuros());
		builder.append(", getLimite()=");
		builder.append(getLimite());
		builder.append(", getBanco()=");
		builder.append(getBanco());
		builder.append(", getAgencia()=");
		builder.append(getAgencia());
		builder.append(", getNumeroconta()=");
		builder.append(getNumeroconta());
		builder.append(", getSaldo()=");
		builder.append(getSaldo());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}