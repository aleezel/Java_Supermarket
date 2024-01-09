package sooper.productos;
import sooper.IProducto;
import sooper.enums.Categoria;

public class Farmacia extends Producto{
	
	public Farmacia(String referencia, int peso, int volumen) {
		super(referencia, peso, volumen);
	}
	
	@Override
	public Categoria getCategoria() {
		return Categoria.FARMACIA;
	}
	
	@Override
	public int getPrecio() {
		//TODO poner el precio, luego averiguar cómo se hace
		return 0;
	}
	
	@Override
	public boolean esCompatible(IProducto p) {
		//TODO
		return false;
	}
	

}
