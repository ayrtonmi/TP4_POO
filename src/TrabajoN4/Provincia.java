package TrabajoN4;

public class Provincia {
	
private String nombre;
private Pais pais;

/*Constructor*/

public Provincia(String nombre) {
	
	this.nombre = nombre;
}

/*Getters Setters*/

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public Pais getPais() {
	return pais;
}

public void setPais(Pais pais) {
	this.pais = pais;
}

/*Metodos*/

public void decirNombre() {
	System.out.println("Mi nombre es: "+nombre);
}

}

