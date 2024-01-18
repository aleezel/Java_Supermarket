package sooper.productos;

import java.time.LocalDate;

import sooper.Caducable;

public class FrutasVerduras extends Alimentacion implements Caducable {
	
	
	private LocalDate caducidad;
	private double precio;
	private int peso;
	
	public FrutasVerduras (String referencia, double precio, int peso, int volumen, LocalDate caducidad) {
		super(referencia, precio, peso, volumen);
		this.peso = peso;
		this.precio = precio;
	}
	
	@Override
	public double getPrecio() {
		return precio * (peso / 1000);
	}

	@Override
	public boolean estaCaducado() {
		return caducidad.isBefore(LocalDate.now());
	}

}
