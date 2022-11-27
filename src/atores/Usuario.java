package atores;

public class Usuario extends Pessoa
{
	private String user;
	private String senha;
	private int qtdVendas;
	private String usuarioTipo;
	public Usuario() {
		super();
	}
	public Usuario(String user ,String nome , String telefone , String endereco ,String dataCadastro, String senha , int qtdVendas, String usuarioTipo) {
		super(nome,telefone,endereco,dataCadastro);
		setUser(user);
		setSenha(senha);
		setQtdVendas(qtdVendas);
		setUsuarioTipo(usuarioTipo);
	}

	public String getUser() {return user;}
	public String getSenha() {return senha;}
	public int getQtdVendas() {
		return qtdVendas;
	}
	public String getUsuarioTipo() {return usuarioTipo;}
	public void setUser(String user)
	{
		this.user = user;
	}
	public void setSenha(String senha)
	{
		this.senha = senha;
	}
	public void setQtdVendas(int qtdVendas)
	{
		this.qtdVendas = qtdVendas;
	}
	public void setUsuarioTipo(String usuarioTipo){
			this.usuarioTipo = usuarioTipo;
	}
}
