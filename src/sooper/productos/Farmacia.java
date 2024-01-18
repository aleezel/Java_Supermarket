package sooper.productos;
import sooper.IProducto;
import sooper.enums.Categoria;

public class Farmacia extends Producto{
	



	public Farmacia(String referencia, double precio, int peso, int volumen) {
		super(referencia, precio, peso, volumen);
	}
	

	
	@Override
	public Categoria getCategoria() {
		return Categoria.FARMACIA;
	}
	
	
	@Override
	public boolean esCompatible(IProducto p) {
		return !Categoria.ALIMENTACION.equals(p.getCategoria()) && !Categoria.MASCOTAS.equals(p.getCategoria());
	}
	

}
