package IoCDI;

public class UsuarioImplMongo implements IUsuario {

	@Override
	public void insertaUsuario() {
		// TODO Auto-generated method stub

		System.out.println("Insertando Usuario en Mongo");
	}

	@Override
	public void deleteUsuario(int id) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando Usuario en Mongo: "+id);
	}

}
