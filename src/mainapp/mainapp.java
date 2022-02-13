package mainapp;

import models.Medicamento;
import models.Usuario;
import utils.Almacen;
import views.LoginView;

public class mainapp {

	public static void main(String[] args) {
		
		//Creo un usuario único de la farmacia y lo añado al array de usuarios
		Usuario u = new Usuario(0, "0000");
		Almacen.usuarios.add(u);
		
		//Creo los medicamentos con los que cuenta la farmacia y los añado al array de medicamentos
		Medicamento m1 = new Medicamento(0, "Kern Pharma 400mg", "Ibuprofeno", "Pildoras", 1993, 32, 4.65);
		Almacen.medicamentos.add(m1);
		Medicamento m2 = new Medicamento(1, "Mejoral 500mg", "Paracetamol", "Pastillas", 1970, 27, 1.10);
		Almacen.medicamentos.add(m2);
		Medicamento m3 = new Medicamento(2, "Cinfatós 200ml", "Dextrometorfano", "Jarabe", 1968, 20,  8.90);
		Almacen.medicamentos.add(m3);
		
		//Creo una LoginView
		LoginView lg = new LoginView();
	}
}
