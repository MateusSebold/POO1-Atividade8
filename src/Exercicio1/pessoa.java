package Exercicio1;

public class pessoa {

	private String nome;
	private String enderešo;
	
	
	
	

	

	
	public pessoa(String nome2, String enderešo2) {
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("pessoa [nome=");
		builder.append(nome);
		builder.append(", enderešo=");
		builder.append(enderešo);
		builder.append(", getNome()=");
		builder.append(getNome());
		builder.append(", getEnderešo()=");
		builder.append(getEnderešo());
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
