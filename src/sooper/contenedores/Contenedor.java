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

	public Contenedor(String referencia, int alto, int resistencia) {
		this.referencia = referencia;
		this.alto = alto;
		this.resistencia = resistencia;
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
		return getVolumen() - volumenOcupado();
	}
	
	//Para saber el volumen ocupado, tiene que iterar entre los productos ya añadidos y sumar sus volúmenes
	private int volumenOcupado() {
		int resultado = 0;
		for (IProducto p : productos) {
			resultado += p.getVolumen();
		}
		return resultado;
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
	}*/

	
	//Evaluar las los requerimientos necesarios.
	//Si al final todos son true, añadirá el producto al contenedor.
	@Override
	public boolean meter(IProducto producto) {
		boolean resistenciaOk = resiste(producto);
		boolean volumenOk = producto.tengoEspacio(this);//Vamos a preguntarle al producto si tiene espacio en el contenedor. Por qué se tiene que preguntar al producto? Porque al final, cada producto se debe evaluar a sí mismo cada vez que deba ser añadido.
		boolean compatibilidadOk = true; //Para saber si es compatible, se necesita hacer un bucle
		
		for (IProducto p : productos) {
			boolean compatibleOk = producto.esCompatible(p);
			compatibilidadOk &= compatibleOk;
		}
		
		boolean acepta = resistenciaOk && volumenOk && compatibilidadOk;
		if (acepta) {
			productos.add(producto);
			producto.meter(this);
		}
		return acepta;
	}

	//El contenedor resistirá si su resistencia es mayor a la del peso del producto
	@Override
	public boolean resiste(IProducto producto) {
		return resistencia > producto.getPeso();
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
