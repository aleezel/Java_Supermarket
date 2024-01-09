package sooper.productos;
import sooper.IProducto;
import sooper.enums.Categoria;

public class Higiene extends Producto {
	
	//Constructor
	public Higiene(String referencia, int peso, int volumen) {
		super(referencia, peso, volumen);
	}
	
	@Override
	public Categoria getCategoria() {
		return Categoria.HIGIENE;
	}
	
	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public boolean esCompatible(IProducto p) {
		//TODO
		return false;
	}


}
