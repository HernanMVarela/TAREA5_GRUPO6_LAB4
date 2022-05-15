package dominio;

public class Categoria {
	
	private int ID;
	private String nombre;
	
	//Get&Set
	
	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Constructor

	public Categoria() {
		ID = 0;
		nombre = "NoName";
	}
	
	public Categoria(int ID, String nombre) {
		this.ID = ID;
		this.nombre = nombre;
	}

	//toString
	
	@Override
	public String toString() {
		return nombre;
	}
	
	
	
}
