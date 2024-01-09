package sooper.productos;

import sooper.IContenedor;
import sooper.IProducto;

public abstract class Producto implements IProducto {
	
	private String referencia;
	private int peso;
	private int volumen;
	
	
	//Constructor
	public Producto(String referencia, int peso, int volumen) {
		super();
		this.referencia = referencia;
		this.peso = peso;
		this.volumen = volumen;
	}

	@Override
	public String getReferencia() {
		return referencia;
	}

	@Override
	public int getPeso() {
		return peso;
	}

	@Override
	public int getVolumen() {
		return volumen;
	}

	// Como este método depende de los hijos, ellos se encargarán, por lo que la clase se tendrá que volver abstracta
	
	/*@Override
	public int getPrecio() {
	}
	
	public String getCategoria() {
	}

	public boolean esCompatible(IProducto p) {
	}*/

	@Override
	public boolean tengoEspacio(IContenedor contenedor) {
		// TODO Auto-generated method stub
		return false;
	}

}
