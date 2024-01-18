package sooper.productos;
import sooper.IProducto;
import sooper.enums.Categoria;

public abstract class Alimentacion extends Producto {
	

	private double precio;

	public Alimentacion(String referencia, double precio, int peso, int volumen) {
		super(referencia, precio, peso, volumen);
		this.precio = precio;
	}
	
	@Override
	public double getPrecio() {
		return precio;
	}
	

	@Override
	public Categoria getCategoria() {
		return Categoria.ALIMENTACION;
	}

	@Override
	public boolean esCompatible(IProducto p) {
		return Categoria.ALIMENTACION.equals(p.getCategoria());
	}



}
