package juegoMuniemon;

import java.util.Scanner;

public class Combate {

	private Muniemon muniemon1;
	private Muniemon muniemon2;

	public Combate(Muniemon muniemon1, Muniemon muniemon2) {
		this.muniemon1 = muniemon1;
		this.muniemon2 = muniemon2;

	}

	public Muniemon getMuniemon1() {
		return muniemon1;
	}

	public void setMuniemon1(Muniemon muniemon1) {
		this.muniemon1 = muniemon1;
	}

	public Muniemon getMuniemon2() {
		return muniemon2;
	}

	public void setMuniemon2(Muniemon muniemon2) {
		this.muniemon2 = muniemon2;
	}

	public void empezarCombate() {

		if (muniemon1.getVelocidad() > muniemon2.getVelocidad()) {
			combate(muniemon1, muniemon2);

		} else {
			combate(muniemon2, muniemon1);
		}
	}

	private void combate(Muniemon muniemon1, Muniemon muniemon2) {
		Scanner scanner = new Scanner(System.in);

		 do {

			 if (comprobarGanador()) {
				 break;
			 }
			muniemon1.atacarMuniemon(muniemon2);
			System.out.println();
			System.out.println("Pulsa enter para continuar...");
			scanner.nextLine();
			if (comprobarGanador()) {
				break;
			}
			muniemon2.atacarMuniemon(muniemon1);
			System.out.println();
			System.out.println("Pulsa enter para continuar...");
			scanner.nextLine();
			System.out.println();

		}while (muniemon1.getVida() > 0 && muniemon2.getVida() > 0);

	}

	private boolean comprobarGanador() {
		if (muniemon1.getVida() == 0) {
			System.out.println(muniemon2.getNombre() + " ganó.");
			return true;
		}

		if (muniemon2.getVida() == 0) {
			System.out.println(muniemon1.getNombre() + " ganó.");
			return true;
		}
		return false;

	}
}
