package atores;

public class Usuario extends Pessoa
{
	private String user;
	private String senha;
	private int qtdVendas;
	private String usuarioTipo;
	public Usuario(String user ,String nome , String telefone , String endereco ,String dataCadastro, String senha , int qtdVendas, String usuarioTipo)
	{
		super(nome,telefone,endereco,dataCadastro);
		setUser(user);
		setSenha(senha);
		setQtdVendas(qtdVendas);
		setUsuarioTipo(usuarioTipo);
	}

	public Usuario() {
        super();
    }

	//////////////////////////////////////////////////////////
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
	////////////////////////////////////////////
	public String getUsuarioTipo() {return usuarioTipo;}
	public int getQtdVendas() {
		return qtdVendas;
	}
	public String getSenha() {return senha;}
	public String getUser() {return user;}

	@Override
	public String toString() {
		return "Usuario{" +
				"user='" + user + '\'' +
				", senha='" + senha + '\'' +
				", qtdVendas='" + qtdVendas + '\'' +
				", usuarioTipo='" + usuarioTipo + '\'' +
				'}';
	}
}
