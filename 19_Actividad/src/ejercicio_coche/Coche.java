package ejercicio_coche;

public class Coche {
	private int id;
	private String matricula;
	private String marca;
	static private int contadorID = 1;
	
	public static final String TOYOTA = "TOYOTA";
	public static final String RENAULT = "RENAULT";
	
	
	public Coche() {
		super();
		this.id = contadorID;
		contadorID++;
	}

	@Override
	public String toString() {
		return "Coche [id=" + id + ", matricula=" + matricula + ", marca=" + marca + "]";
	}

	public int getId() {
		return id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public static void showContadorID() {
		System.out.println(contadorID);
	}
	
	public static void resetContadorID() {
		contadorID = 0;
	}
	
}


