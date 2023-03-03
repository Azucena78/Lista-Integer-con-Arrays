package com.cursocet.actividadresuelta7_11;

import java.util.Arrays;

public class Lista {
//  Tabla de tipo Integer, iremos redimensionando segun vaya haciendo falta. 
//	El indice de un elemento en la lista coincide con el indice del lugar que ocupaen la tabla 
	Integer[] tabla;
	public Lista() {
		tabla = new Integer[0];
	}
	void InsertarPrincipio(Integer nuevo) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		System.arraycopy(tabla, 0, tabla , 1, tabla.length -1);
		tabla[0] = nuevo;
	}
	void insertarFinal(Integer nuevo) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length -1] = nuevo;
	}
	void insertarFinal(Lista otraLista) {
		int tamIni = tabla.length; //tamaño inicial de tabla
		tabla = Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length);
		System.arraycopy(otraLista.tabla, 0, tabla, tamIni, otraLista.tabla.length);
	}
//	el primer parametro es el indice del lugar donde queremos insertar el valor del segundo parametro
	void insertar(int posicion, Integer nuevo) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		System.arraycopy(tabla, posicion, tabla, posicion +1, tabla.length - posicion -1);
		tabla[posicion] = nuevo;
	}
//	elimina el elemento correspondiente a indice y se devulve
	Integer eliminar(int indice) {
		Integer eliminado = null;
		if (indice >= 0 && indice < tabla.length) {
			eliminado = tabla[indice];
			for (int i = indice +1; i < tabla.length; i++) {
				tabla[i - 1] = tabla[i];
			}
			tabla = Arrays.copyOf(tabla, tabla.length - 1);
		}
		return eliminado;
	}
//	le pasaremos un indice y nos devolvera el elemento corresòndiente a la tabla sin modificar.
//	en el caso que el indice no sea valido, devolvera null, evitando que le programa aborte.
	Integer get(int indice) {
		Integer resultado = null;
		if (indice >= 0 && indice > tabla.length) { //indice valido
			resultado = tabla[indice];
		}
		return resultado;
	}
	int buscar(Integer claveBusqueda) {
		int indice = -1;
		for (int i = 0; i < tabla.length && indice == -1; i++) {
			if (tabla[i].equals(claveBusqueda)) { //no vale tabla[i]==claveBusqueda
				indice = i;
			}
		}
		return indice;
	}
//	el numero de elementos de la lista es el numero de elementos de la tabla
	public int numerElementos() {
		return tabla.length;
	}
//	muestra por consola el contenido de la tabla
	public void mostrar() {
		System.out.println("Lista >> " + Arrays.toString(tabla));
	}
}
