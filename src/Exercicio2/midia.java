package Exercicio2;

public class midia extends item{

	public midia(int codigo2, String descricao2, String gravadora2, double duracao2) {
		super(codigo2, descricao2);
		// TODO Auto-generated constructor stub
	}

	private String gravadora;
	private double tempo;
	
	
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	public double getTempo() {
		return tempo;
	}
	public void setTempo(double tempo) {
		this.tempo = tempo;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("midia [gravadora=");
		builder.append(gravadora);
		builder.append(", tempo=");
		builder.append(tempo);
		builder.append(", getGravadora()=");
		builder.append(getGravadora());
		builder.append(", getTempo()=");
		builder.append(getTempo());
		builder.append(", getCodigo()=");
		builder.append(getCodigo());
		builder.append(", getDescricao()=");
		builder.append(getDescricao());
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
