package Exercicio1;

public class pessoa {

	private String nome;
	private String endere�o;
	
	
	
	

	

	
	public pessoa(String nome2, String endere�o2) {
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("pessoa [nome=");
		builder.append(nome);
		builder.append(", endere�o=");
		builder.append(endere�o);
		builder.append(", getNome()=");
		builder.append(getNome());
		builder.append(", getEndere�o()=");
		builder.append(getEndere�o());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
