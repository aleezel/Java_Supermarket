package sooper;

import java.util.Set;
import sooper.enums.TipoContenedor;

public interface IContenedor {

	String getReferencia();
	
	//Volumen inicial
	int getVolumen();
	
	int getSuperficie();
	
	//Volumen considerando los productos dentro de él
	int volumenDisponible();
	
	//Resistencia al peso del contenedor
	int getResistencia();
	
	//Los productos que tiene el contenedor
	Set<IProducto> getProductos();
	
	//Tipo de contenedor: caja o bolsa.
	TipoContenedor getTipo();
	
	//Métodos
	
	//Evaluar si se puede añadir un producto o no
	boolean meter(IProducto producto);
	
	//Comprueba si el contenedor puede resistir el peso del producto
	boolean resiste(IProducto producto);

	
}
