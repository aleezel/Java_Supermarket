package sooper;

import java.time.LocalDate;

import sooper.contenedores.Bolsa;
import sooper.contenedores.Caja;
import sooper.productos.Fresco;
import sooper.productos.*;

public class Supermercado {
	
	public static void main(String[] args) {
		
		//Declaramos un nuevo pedido con su número de referencia y su espacio para los contenedores que se almacenarán en el HashSet
		IPedido miPedido = new Pedido("Pedido001");
		
		//Declaramos los contenedores y sus dimensiones
		IContenedor bolsa1 = new Bolsa("B11", 40, 25, 900);
		IContenedor caja1 = new Caja("C22", 30, 50, 75);
		System.out.println("Bolsa: " + bolsa1);
		System.out.println("Caja: " + caja1);
		
		//Agregamos los contenedores al pedido creado previamente
		miPedido.addContenedor(bolsa1);
		miPedido.addContenedor(caja1);
		
		//Añadir nueva serie de 3 cajas
		for (int i = 0; i < 3; i++) {
			IContenedor cajas2 = new Caja("C23" + i, 30, 40, 30);
			miPedido.addContenedor(cajas2);
		}
		
		//Añadir nueva serie de 5 bolsas
		for (int i = 0; i < 5; i++) {
			IContenedor bolsas2 = new Bolsa ("B12" + i, 3000, 30, 900);
			miPedido.addContenedor(bolsas2);
		}
		
		System.out.println("Mi pedido con contenedores: " + miPedido);
		
		
		
		// PRODUCTOS
		
		//Se declaran los productos en su respectiva categoría con su referencia, precio, peso y volumen en cm3
		IProducto manzanas = new FrutasVerduras("MANZANA", 34, 1000, 1500, LocalDate.now().plusDays(20));
		IProducto arroz = new NoPerecedero("ARROZ", 20, 800, 1000);
		IProducto helado = new Congelado("HELADO", 54, 800, 1000);
		IProducto papelWC = new Higiene("PAPEL H", 56, 500, 2500);
		IProducto peras = new FrutasVerduras("PERA", 30.0, 500, 1200, LocalDate.now());
		
		//Agrega una serie de 24 botes de leche
		for (int i = 0; i < 24; i++) {
			IProducto leche = new Fresco("LECHE", 18, 1000, 1000, LocalDate.now());
			miPedido.addProducto(leche);
		}
		
		//A su vez, estos productos se deben añadir al pedido
		IContenedor contManzanas = miPedido.addProducto(manzanas);
		IContenedor contArroz = miPedido.addProducto(arroz);
		IContenedor contHelado = miPedido.addProducto(helado);
		IContenedor contPapel = miPedido.addProducto(papelWC);
		IContenedor contPeras = miPedido.addProducto(peras);
		System.out.println("Mi pedido con productos: " + miPedido);
		
	}

}
