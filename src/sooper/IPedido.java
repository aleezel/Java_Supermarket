package sooper;

import java.util.Set;

public interface IPedido {
	
	//Numero identificador de referencia del pedido
	String getReferencia();
	
	//Los productos forman parte del pedido
	Set<IProducto> getProductos();
	
	//Los contenedores pueden formar parte del pedido
	Set<IContenedor> getContenedores();
	
	//A los pedidos se les van a añadir contenedores
	//Solo estamos declarando el método sin cuerpo
	void addContenedor(IContenedor contenedor);
	
	//Método para añadir productos. A la vez, nos indica en qué contenedor lo ha colocado, para distribuir los productos en los contenedores.
	IContenedor addProducto(IProducto producto);


}
