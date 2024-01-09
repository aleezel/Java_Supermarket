package sooper.contenedores;

import java.util.Set;
import java.util.HashSet;

import sooper.IContenedor;
import sooper.IProducto;

public abstract class Contenedor implements IContenedor {
	
	//Se declara privado pero se accederá a él a través de su Get
	private String referencia;
	private int alto;
	
	//Me faltó añadir estos
	private int resistencia;
	private Set<IProducto> productos;

	public Contenedor(String referencia, int alto) {
		this.referencia = referencia;
		this.alto = alto;
		productos = new HashSet<IProducto>();
	}

	//El override sobreescribe la declaración del padre.
	//Los get solo devuelven algo
	@Override
	public String getReferencia() {
		return referencia;
	}

	@Override
	public int getVolumen() {
		return alto * getSuperficie();
	}

	@Override
	public int volumenDisponible() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getResistencia() {
		return resistencia;
	}

	@Override
	public Set<IProducto> getProductos() {
		return productos;
	}

	//Las clases hijas definirán el tipo de producto
	/*@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return null;
	}*/

	@Override
	public boolean meter(IProducto producto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean resiste(IProducto producto) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Contenedor " + referencia + " [" + getTipo() + "] \n" + "\t\t(Superficie: " + getSuperficie() + "cm2 - Volumen: " + getVolumen() + "cm3 - Resistencia: " + getResistencia() + "g.");
		//Se le agrega un método de Java de tipo booleano para que verifique si está vacio o no
		if(productos.isEmpty()) {
			sb.append("\t\tvacío\n");
		}
		for(IProducto p : productos) {
			sb.append("\t\t" + p + "\n");
		}
		sb.append("\t\t>> Volumen disponible: " + volumenDisponible() + "cm3");
		return sb.toString();
	}
	

}
