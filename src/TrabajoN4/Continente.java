package TrabajoN4;

import java.util.ArrayList;

public class Continente {

	private String nombre;
	private ArrayList<Pais> paises;
	
	/*Constructor*/
	
	public Continente(String nombre, ArrayList paises) {
		this.nombre = nombre;
		this.paises = paises;
	}

	/*Getters Setters*/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Pais> getPaises() {
		return paises;
	}

	public void setPaises(ArrayList<Pais> paises) {
		this.paises = paises;
	}
	
	/*Metodos*/
	
	public void mostrarPaises() {
		
		System.out.println(paises);
	}
	
}


