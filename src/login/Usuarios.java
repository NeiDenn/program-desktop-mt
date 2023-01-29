package login;

public class Usuarios {
	
	public boolean ValidarUsuarios(String usuario, String contrase�a) {
		if(usuario.equals("Lionel") && contrase�a.equals("Messi")) {
			return true;
		}else if(usuario.equals("Julian") && contrase�a.equals("Alvares")) {
			return true;
		}else {
			return false;
		}
	}
}
