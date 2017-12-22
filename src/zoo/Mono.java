package zoo;

public class Mono extends Animal{

	private String nombre;
	private String raza;
	
	
	/*
	 * CONSTRUCTORS
	 */
	
	public Mono(){
		super("mono", 2);
	}
	
	public Mono(String nombre, String raza){
		super("mono", 2);
		this.nombre = nombre;
		this.raza = raza;
	}

	/*
	 * FUNCTIONS & METHODS
	 */
	
	
	
	
	
	
	/*
	 * GETTERS & SETTERS
	 */

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getRaza() {
		return raza;
	}



	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	
}
