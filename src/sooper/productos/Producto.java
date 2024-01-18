package sooper.productos;

import sooper.IContenedor;
import sooper.IProducto;
import sooper.contenedores.Contenedor;

public abstract class Producto implements IProducto {
	
	private String referencia;
	private double precio;
	private int peso;
	private int volumen;
	private IContenedor contenedor;
	
	//Constructor
	public Producto(String referencia, double precio, int peso, int volumen) {
		super();
		this.referencia = referencia;
		this.precio = precio;
		this.peso = peso;
		this.volumen = volumen;
	}

	@Override
	public String getReferencia() {
		return referencia;
	}

	@Override
	public int getPeso() {
		return peso;
	}

	@Override
	public int getVolumen() {
		return volumen;
	}
	
	@Override
	public double getPrecio() {
		return precio;
	}

	// Como este método depende de los hijos, ellos se encargarán, por lo que la clase se tendrá que volver abstracta
	/*
	public String getCategoria() {
	}

	public boolean esCompatible(IProducto p) {
	}*/

	@Override
	public boolean tengoEspacio(IContenedor contenedor) {
		return contenedor.volumenDisponible() > volumen;
	}
	
	//¿Qué se necesita para meter este producto a un contenedor? Pues agarrarlo y ponerlo dentro del contenedor que viene de IContenedor.
	@Override
	public void meter(Contenedor contenedor) {
		this.contenedor = contenedor;
	}
	
	
	//Personalizamos el método toString que devuelve al llamado en consola. Lo logramos sobreescribiéndolo.
		@Override
		public String toString() {
			//Lo de abajo es una clase que optimiza la construcción de strings hechas con contatenación de otras elementos. Es una mejor práctica al parecer.
			StringBuilder sb = new StringBuilder("Producto " + referencia + "[" + getCategoria() + "]" + " - Precio: " + getPrecio() + " - Peso: " + getPeso() + "- Volumen: " + getVolumen());
			

			return sb.toString();
		}

}
