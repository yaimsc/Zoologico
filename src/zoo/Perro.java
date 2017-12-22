package zoo;

public class Perro extends Animal {


	private String raza;
	private String color;
	private String nombre;
	
	public Perro(String nombre, String raza) {
		super("perro", 2);
		this.nombre=nombre;
	}
	

	
	
	
	
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
