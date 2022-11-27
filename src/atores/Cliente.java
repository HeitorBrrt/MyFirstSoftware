package atores;

public class Cliente extends Pessoa {
	private String idCliente;
	private String userUsuario;
	public Cliente() {

	}
	public Cliente(String idCliente,String nome, String telefone, String endereco, String dataCadastro, String userUsuario) {
		super(nome,telefone,endereco,dataCadastro);
		setIdCliente(idCliente);
		setUserUsuario(userUsuario);
	}
	public void setUserUsuario(String userUsuario)
	{
		this.userUsuario=userUsuario;
	}
	public void setIdCliente(String idCliente)
	{
		this.idCliente = idCliente;
	}
	public String getIdCliente() {
		return idCliente;
	}
	public String getUserUsuario() {
		return userUsuario;
	}
}