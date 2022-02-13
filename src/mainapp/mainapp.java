package mainapp;

import models.Usuario;
import utils.Almacen;
import views.LoginView;

public class mainapp {

	public static void main(String[] args) {
		
		Usuario u = new Usuario(0, "0000");
		Almacen.usuarios.add(u);
		
		//Creo una LoginView
		LoginView lg = new LoginView();
	}
}
