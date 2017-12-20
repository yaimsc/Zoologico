package zoo;

public class Perro extends Animal {



	
	public Perro(String especie, int patas) {
		super(especie, patas);
	}
	
	private String raza;
	private String color;
	
	
	
	
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
