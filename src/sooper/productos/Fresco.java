package sooper.productos;

import java.time.LocalDate;

import sooper.Caducable;

public class Fresco extends Alimentacion implements Caducable {
	
	private LocalDate caducidad;

	public Fresco (String referencia, double precio, int peso, int volumen, LocalDate caducidad) {
		super(referencia, precio, peso, volumen);
		this.caducidad = caducidad;
	}
	
	@Override
	public boolean estaCaducado() {
		return caducidad.isBefore(LocalDate.now());
	}

}
