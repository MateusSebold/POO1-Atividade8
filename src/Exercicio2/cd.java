package Exercicio2;

public class cd extends midia {

	public cd(int codigo2, String descricao2, String gravadora2, double duracao2) {
		super(codigo2, descricao2, gravadora2, duracao2);
		// TODO Auto-generated constructor stub
	
	}
	
	private int faixa;
	private String artista;
	private String album;
	
	public int getFaixa() {
		return faixa;
	}
	public void setFaixa(int faixa) {
		this.faixa = faixa;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("cd [faixa=");
		builder.append(faixa);
		builder.append(", artista=");
		builder.append(artista);
		builder.append(", album=");
		builder.append(album);
		builder.append(", getFaixa()=");
		builder.append(getFaixa());
		builder.append(", getArtista()=");
		builder.append(getArtista());
		builder.append(", getAlbum()=");
		builder.append(getAlbum());
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
