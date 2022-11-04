package IoCDI;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UsuarioFactory obj = new UsuarioFactory(new UsuarioImplMongo());
		obj.getEliminaUsuario(1);
		obj.getInsertaUsuario();
	}

}
