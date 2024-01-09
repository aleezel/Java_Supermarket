package sooper;

import sooper.contenedores.Bolsa;
import sooper.contenedores.Caja;
import sooper.productos.Fresco;
import sooper.productos.*;

public class Supermercado {
	
	public static void main(String[] args) {
		//Declaramos un nuevo pedido con su número de referencia y su espacio para los contenedores que se almacenarán en el HashSet
		IPedido miPedido = new Pedido("Pedido001");
		
		//Declaramos los contenedores y sus dimensiones
		IContenedor bolsa1 = new Bolsa("B11", 40, 25);
		IContenedor caja1 = new Caja("C22", 30, 50, 75);
		System.out.println("Bolsa: " + bolsa1);
		System.out.println("Caja: " + caja1);
		
		//Agregamos los contenedores al pedido creado previamente
		miPedido.addContenedor(bolsa1);
		miPedido.addContenedor(caja1);
		System.out.println("Mi pedido con contenedores: " + miPedido);
		
		//Se declaran los productos en su respectiva categoría con su referencia, peso y volumen en cm3
		IProducto manzanas = new Fresco("MNZ", 1000, 1500);
		IProducto arroz = new NoPerecedero("ARRZ", 1000, 1000);
		IProducto helado = new Congelado("HLD", 800, 1000);
		IProducto papelWC = new Higiene("PWC", 500, 2500);
		IProducto peras = new Fresco("PER", 800, 1200);
		
		//A su vez, estos productos se deben añadir al pedido
		IContenedor contManzanas = miPedido.addProducto(manzanas);
		IContenedor contArroz = miPedido.addProducto(arroz);
		IContenedor contHelado = miPedido.addProducto(helado);
		IContenedor contPapel = miPedido.addProducto(papelWC);
		IContenedor contPeras = miPedido.addProducto(peras);
		System.out.println("Mi pedido con productos: " + miPedido);
		
	}

}
