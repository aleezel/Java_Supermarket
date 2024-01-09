package sooper.productos;
import sooper.IProducto;
import sooper.enums.Categoria;

public class Mascotas extends Producto {
	
	//Constructor
	public Mascotas (String referencia, int peso, int volumen) {
		super(referencia, peso, volumen);
	}
	
	@Override
	public Categoria getCategoria() {
		return Categoria.MASCOTAS;
	}
	
	@Override
	public int getPrecio() {
		return 0;
	}
	
	@Override
	public boolean esCompatible(IProducto p) {
		//TODO
		return false;
	}

}
