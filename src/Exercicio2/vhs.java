package Exercicio2;

public class vhs extends midia {

	public vhs(int codigo2, String descricao2,String gravadora2,double duracao2) {
		super(codigo2, descricao2,gravadora2,duracao2);
		// TODO Auto-generated constructor stub
	}
	private String titulo;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("vhs [titulo=");
		builder.append(titulo);
		builder.append(", getTitulo()=");
		builder.append(getTitulo());
		builder.append(", getGravadora()=");
		builder.append(getGravadora());
		builder.append(", getTempo()=");
		builder.append(getTempo());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append(", getCodigo()=");
		builder.append(getCodigo());
		builder.append(", getDescricao()=");
		builder.append(getDescricao());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
