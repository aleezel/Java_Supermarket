package sooper.productos;
import sooper.IProducto;
import sooper.enums.Categoria;

public class Mascotas extends Producto {
	


	//Constructor
	public Mascotas (String referencia, double precio, int peso, int volumen) {
		super(referencia, precio, peso, volumen);
	}
	
	@Override
	public Categoria getCategoria() {
		return Categoria.MASCOTAS;
	}
	
	

	@Override
	public boolean esCompatible(IProducto p) {
		return !Categoria.FARMACIA.equals(p.getCategoria());
	}

}
