package Exercicio1;

public class pessoajuridica extends pessoa {
	public pessoajuridica(String nome,String endereço) {
		super(nome,endereço);
	}
	
	private String cnpj;
	private String tipoempresa;
	
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getTipoempresa() {
		return tipoempresa;
	}
	public void setTipoempresa(String tipoempresa) {
		this.tipoempresa = tipoempresa;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("pessoajuridica [cnpj=");
		builder.append(cnpj);
		builder.append(", tipoempresa=");
		builder.append(tipoempresa);
		builder.append(", getCnpj()=");
		builder.append(getCnpj());
		builder.append(", getTipoempresa()=");
		builder.append(getTipoempresa());
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
