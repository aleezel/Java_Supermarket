package sooper.contenedores;

import sooper.enums.TipoContenedor;

public class Bolsa extends Contenedor {
	
	private int ancho;
	private int alto;

	//Constructor
	public Bolsa(String referencia, int alto, int ancho) {
		super(referencia, alto);
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public int getDiametro() {
		return (int) ((2 * ancho) / Math.PI);
	}

	@Override
	public int getSuperficie() {
		int radio = getDiametro() / 2;
		return (int) (Math.PI * radio * radio);
	}

	@Override
	public TipoContenedor getTipo() {
		return TipoContenedor.BOLSA;
	}

}
