package com.cursocet.actividadresuelta7_11;

public class Main {

	public static void main(String[] args) {
		
//		prueba de los metodos de la clase Lista
		Lista l1 = new Lista();
		Lista l2 = new Lista();
		l1.insertarFinal(4);
		l1.insertarFinal(5);
		l1.insertarFinal(6);
		l1.mostrar();
		l1.InsertarPrincipio(3);
		l1.InsertarPrincipio(2);
		l1.InsertarPrincipio(1);
		l1.mostrar();
		l1.insertar(2, 99);
		l1.mostrar();
		l1.eliminar(2);
		l1.mostrar();
		System.out.println(l1.buscar(4));
		l2.insertarFinal(10);
		l2.insertarFinal(20);
		l2.insertarFinal(30);
		l2.insertarFinal(40);
		l2.insertarFinal(50);
		l2.mostrar();
		l1.insertarFinal(12);
		l1.mostrar();
		
	}

}
