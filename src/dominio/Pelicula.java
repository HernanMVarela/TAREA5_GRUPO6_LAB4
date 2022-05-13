package dominio;

public class Pelicula implements Comparable<Pelicula> {
	private Categoria genero;
	private int ID;
	private static int contarID = 0;
	private String Nombre;
	
	//get&set
	
	public Categoria getCategoria() {
		return genero;
	}
	
	public void setCategoria(Categoria categoria) {
		genero = categoria;
	}
	public int getID() {
		return ID;
	}
	
	public String getNombre() {
		return Nombre;
	}
	
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	public int getCont() {
		return contarID;
	}
	
	//Constructor
	
	public Pelicula() {
		
		contarID++;
		this.ID=contarID;
		genero= new Categoria();
		Nombre = "";
	}
	
	public Pelicula(Categoria categoria, String nombre) {
		
		contarID++;
		this.ID=contarID;
		genero = categoria;
		Nombre = nombre;
	}
	
	//toString
	
	@Override
	public String toString() {
		return ID + " " + Nombre + " " + genero;
	}

	
	//CompareTo
	@Override
	public int compareTo(Pelicula p) {
		return this.getNombre().compareTo(p.getNombre());
	}

}
