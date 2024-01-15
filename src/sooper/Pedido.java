package sooper;

import java.util.HashSet;
import java.util.Set;

public class Pedido implements IPedido {
	
	private String referencia;
	private Set<IContenedor> contenedores;
	
	//El pedido está conformado por contenedores de productos, es por ello que se inicializarán el conjunto de contenedores. 
	public Pedido( String referencia) {
		this.referencia = referencia;
		this.contenedores = new HashSet<IContenedor>();
	}
	
	@Override
	public String getReferencia() {
		return referencia;
	}
	
	@Override
	public Set<IProducto> getProductos() {
		return null;
	}
	
	@Override
	public Set<IContenedor> getContenedores() {
		return contenedores;
	}

	@Override
	public void addContenedor(IContenedor contenedor) {
		contenedores.add(contenedor);
		
	}

	//Recorrer todos los contenedores hasta encontrar un contenedor que le queda un producto. Si el producto es compatible o no, devolverá un booleano. Si no encuentra, devolverá null.
	@Override
	public IContenedor addProducto(IProducto producto) {
		for (IContenedor contenedor : contenedores) {
			if (contenedor.meter(producto)) {
				return contenedor;
			}
		}
		return null;
	}
	
	//Personalizamos el método toString que devuelve al llamado en consola. Lo logramos sobreescribiéndolo.
	@Override
	public String toString() {
		//Lo de abajo es una clase que optimiza la construcción de strings hechas con contatenación de otras elementos. Es una mejor práctica al parecer.
		StringBuilder sb = new StringBuilder();
		
		sb.append("Pedido: " + referencia + "\n");
		for (IContenedor contenedor : contenedores) {
			sb.append("\t" + contenedor + "\n");
		}
		return sb.toString();
	}

}
