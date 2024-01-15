package sooper;

import sooper.contenedores.Contenedor;
import sooper.enums.Categoria;

public interface IProducto {
	
	String getReferencia();
	
	int getPeso();
	
	int getVolumen();
	
	int getPrecio();
	
	Categoria getCategoria();
	
	//Métodos
	
	//Para el producto es necesario comparar las categorías para saber si pueden ser guardados en la misma bolsa
	boolean esCompatible(IProducto p);
	
	//Evalua si tiene espacio el contenedor
	boolean tengoEspacio(IContenedor contenedor);

	void meter(Contenedor contenedor);

}
