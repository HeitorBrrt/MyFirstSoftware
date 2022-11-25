package atores;

public class Pessoa 
{
	private String nome;
	private String telefone;
	private String endereco;
	private String dataCadastro;
	
	public Pessoa(String nome, String telefone, String endereco, String dataCadastro)
	{
		super();
		setNome(nome);
		setTelefone(telefone);
		setEndereco(endereco);
		setDataCadastro(dataCadastro);
		
	}

	public Pessoa() {

	}

	public String getDataCadastro() { return dataCadastro;}
	public String getNome() {return nome;}
	public String getTelefone() {return telefone;}
	public String getEndereco() {return endereco;}
//////////////////////////////////////////////////////////////////
	public void setDataCadastro(String dataCadastro)
	{
		this.dataCadastro=dataCadastro;
	}
	public void setNome(String nome)
	{
		this.nome=nome;
	}
	public void setTelefone(String telefone)
	{
		this.telefone=telefone;

	}
	public void setEndereco(String endereco)
	{
		this.endereco=endereco;

	}
}
