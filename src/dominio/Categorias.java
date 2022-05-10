package dominio;

public class Categorias {
	
	private int ID;
	private String Nombre;
	
	//Get&Set
	
	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	
	public String getNombre() {
		return Nombre;
	}
	
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	//Constructor

	public Categorias() {
		ID = 0;
		Nombre = "NoName";
	}
	
	public Categorias(int ID, String Nombre) {
		this.ID = ID;
		this.Nombre = Nombre;
	}

	//toString
	
	@Override
	public String toString() {
		return Nombre;
	}
	
	
	
}
