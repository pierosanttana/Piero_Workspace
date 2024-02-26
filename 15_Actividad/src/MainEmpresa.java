
public class MainEmpresa {

	public static void main(String[] args) {
		
		Empresa[] arrayEmpresas = new Empresa[2];
		
		Empresa e1 = new Empresa("Upgrade", "A29268166", null);
		Empresa e2 = new Empresa("Hub", "F12968166", null);
		
		arrayEmpresas[0] = e1;
		arrayEmpresas[1] = e2;
		
		Trabajador[] arrayTrabajadores = new Trabajador[3];
		
		e1.listaTrabajadores = arrayTrabajadores;
		
		Trabajador t1 = new Trabajador("Piero", "12345678C", 1000);
		Trabajador t2 = new Trabajador("Bros", "12345678C", 1200);
		Trabajador t3 = new Trabajador("Mario", "12345678B", 1200);
		
		
		e1.listaTrabajadores[0] = t1;
		e1.listaTrabajadores[1] = t2;
		e1.listaTrabajadores[2] = t3;
		
		Trabajador[] arrayTrabajadores2 = new Trabajador[3];
		
		e2.listaTrabajadores = arrayTrabajadores2;
		
		e2.listaTrabajadores[0] = t3;
		e2.listaTrabajadores[1] = t2;
		e2.listaTrabajadores[2] = t1;
		
		for (Empresa empresa : arrayEmpresas) {
			System.out.println(empresa.toString());
			empresa.mostrarDatosTrabajores();
			for (Trabajador trabajador : empresa.listaTrabajadores) {
				System.out.println(trabajador.toString());
				System.out.println(trabajador.dniEsValido());
				System.out.println(trabajador.ganaMasQue(t1));
				System.out.println(trabajador.esIgualQue(t3));
			}
			System.out.println(empresa.existeTrabajador("1234567A"));
			System.out.println(empresa.cantidadTrabajadores());
			System.out.println(empresa.gastoEnSalarios());
			System.out.println(empresa.salariosMayorATresMil());
			System.out.println(empresa.salariosMenoresAlSmi());
			System.out.println(empresa.cantidadSalariosMayorA(3000));
			System.out.println(empresa.todosDniSonValidos());
			System.out.println(empresa.esIgualAEmpresa(e2));
		}
		
		
		
	}
	
	

}
