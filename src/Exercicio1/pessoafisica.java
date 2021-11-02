package Exercicio1;

public class pessoafisica extends pessoa {
		public pessoafisica(String nome,String endereço) {
			super(nome,endereço);
		}
	private String cpf;
	private String estadocivil;
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("pessoafisica [cpf=");
		builder.append(cpf);
		builder.append(", estadocivil=");
		builder.append(estadocivil);
		builder.append(", getCpf()=");
		builder.append(getCpf());
		builder.append(", getEstadocivil()=");
		builder.append(getEstadocivil());
		builder.append(", getNome()=");
		builder.append(getNome());
		builder.append(", getEndereço()=");
		builder.append(getEndereço());
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
