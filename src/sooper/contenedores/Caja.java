package sooper.contenedores;

import sooper.enums.TipoContenedor;

public class Caja extends Contenedor {
	
	private int ancho;
	private int largo;
	
	//Con el super, nos referimos a los elementos del constructor
	//Con el this. hacemos referenica a los datos de toda la clase
	
	public Caja (String referencia, int alto, int ancho, int largo) {
		super(referencia, alto);
		this.ancho = ancho;
		this.largo = largo;
	}
	
	
	@Override
	public int getSuperficie() {
		return ancho * largo;
	}

	@Override
	public TipoContenedor getTipo() {
		return TipoContenedor.CAJA;
	}
	

}
