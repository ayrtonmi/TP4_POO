package TrabajoN4;

import java.util.ArrayList;

public class Pais {
	
private String nombre, capital;
private ArrayList<Continente> continent;
private ArrayList<Provincia> provincias;

/*Constructor*/

public Pais(String nombre, String capital, ArrayList continent) {
	this.nombre = nombre;
	this.capital = capital;
	this.continent = continent;
	}

/*Getters Setters*/

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getCapital() {
	return capital;
}

public void setCapital(String capital) {
	this.capital = capital;
}

public ArrayList<Continente> getContinent() {
	return continent;
}

public void setContinent(ArrayList<Continente> continent) {
	this.continent = continent;
}

public ArrayList<Provincia> getProvincias() {
	return provincias;
}

public void setProvincias(ArrayList<Provincia> provincias) {
	this.provincias = provincias;
}

/*Métodos*/

public void mostrarProvincias() {
	
	System.out.println(provincias);
}


}
