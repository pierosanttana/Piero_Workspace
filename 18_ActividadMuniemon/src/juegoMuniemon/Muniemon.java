package juegoMuniemon;

public class Muniemon {
	
	private String nombre;
	private int vida;
	private int ataque;
	private int defensa;
	private TipoMuniemon tipo;
	
	
	@Override
	public String toString() {
		return "Muniemon [nombre=" + nombre + ", vida=" + vida + ", ataque=" + ataque + ", defensa=" + defensa
				+ ", tipo=" + tipo + "]";
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public TipoMuniemon getTipo() {
		return tipo;
	}
	public void setTipo(TipoMuniemon tipo) {
		this.tipo = tipo;
	}
	
	public void atacarMuniemon(Muniemon muniemon) {
		int ataque = this.ataque - muniemon.getDefensa();
		if(this.vida <= 0) {
			System.out.println("No puedes atacar, tu vida es 0.");
		}else if(muniemon.getVida() > 0) {
			if(ataque > 0) {
				muniemon.setVida(muniemon.getVida() - ataque);
				System.out.print(this.nombre + " atacó a " + muniemon.getNombre());
				System.out.println(", le quita " + ataque);
				if(muniemon.getVida() <= 0) {
					System.out.println(muniemon.getNombre() + " ha sido derrotado.");
					muniemon.setVida(0);
				}else {
					System.out.println(muniemon.getNombre() + " ahora tiene " + muniemon.getVida() + " de vida.");
				}
			}else {
				System.out.println("Tu ataque es muy debíl, no puedes ocasionar ningun daño. ");
			}
		}else if(muniemon.vida <= 0){
			System.out.println("La vida de " + muniemon.getNombre() + " es 0, no puede pelear.");
		}
		
	}
	
	
	

}
