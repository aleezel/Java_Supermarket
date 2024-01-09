package sooper.productos;
import sooper.IProducto;
import sooper.enums.Categoria;

public class Alimentacion extends Producto {

	public Alimentacion(String referencia, int peso, int volumen) {
		super(referencia, peso, volumen);
	}

	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Categoria getCategoria() {
		return Categoria.ALIMENTACION;
	}

	@Override
	public boolean esCompatible(IProducto p) {
		// TODO Auto-generated method stub
		return false;
	}

}
