package IoCDI;

public class UsuarioFactory {

	IUsuario usr;
	
	public UsuarioFactory(IUsuario usr) {
		this.usr = usr;
	}
	public void getInsertaUsuario()
	{
		usr.insertaUsuario();
	}
	public void getEliminaUsuario(int id)
	{
		usr.deleteUsuario(id);
	}
	
}
