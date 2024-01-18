package sooper.productos;
import sooper.IProducto;
import sooper.enums.Categoria;

public class Higiene extends Producto {
	
	
	//Constructor
	public Higiene(String referencia, double precio, int peso, int volumen) {
		super(referencia, precio, peso, volumen);
	}
	
	@Override
	public Categoria getCategoria() {
		return Categoria.HIGIENE;
	}
	
	
	
	
	@Override
	public boolean esCompatible(IProducto p) {
		return !Categoria.ALIMENTACION.equals(p.getCategoria());
	}


}
