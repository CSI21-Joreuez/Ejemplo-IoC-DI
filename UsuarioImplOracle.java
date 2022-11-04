package IoCDI;

public class UsuarioImplOracle implements IUsuario {

	@Override
	public void insertaUsuario() {
		// TODO Auto-generated method stub

		System.out.println("Insertando Usuario en Oracle");
	}

	@Override
	public void deleteUsuario(int id) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando Usuario en Oracle: "+id);

	}


}
