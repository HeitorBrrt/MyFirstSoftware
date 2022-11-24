package estoque;

public class Produto 
{
	private String idProduto;
	private String produtoNome;
	private String telefoneImportadora;
	private String enderecoImportadora;
	private String precoVenda;
	private String precoCompra;

	private String datacadastro;
	public Produto(String idProduto, String produtoNome, String telefoneImportadora, String enderecoImportadora,
				   String precoCompra, String precoVenda, String datacadastro) {
		super();
		setIdProduto(idProduto);
		setProdutoNome(produtoNome);
		setTelefoneImportadora(telefoneImportadora);
		setEnderecoImportadora(enderecoImportadora);
		setPrecoCompra(precoCompra);
		setPrecoVenda(precoVenda);

	}

    public Produto() {

    }

	public void setIdProduto(String idProduto){
		this.idProduto=idProduto;
	}
	public void setTelefoneImportadora(String telefoneImportadora) {
		this.telefoneImportadora=telefoneImportadora;
	}
	public void setProdutoNome(String produtoNome) {
		this.produtoNome = produtoNome;
	}
	public void setEnderecoImportadora(String enderecoImportadora) {
		this.enderecoImportadora = enderecoImportadora;
	}
	public void setPrecoVenda(String precoVenda)
	{
		this.precoVenda=precoVenda;
	}
	public void setPrecoCompra(String precoCompra)
	{
		this.precoCompra=precoCompra;
	}
	public  void setDatacadastro(String datacadastro){
		this.datacadastro = datacadastro;
	}
	public String getIdProduto() {return idProduto;}
	public String getTelefoneImportadora() { return telefoneImportadora;}
	public String getPrecoVenda() { return precoVenda;}
	public String getPrecoCompra() {return precoCompra;}
	public String getProdutoNome() { return produtoNome;}
	public String getEnderecoImportadora() {
		return enderecoImportadora;
	}
	public String getDatacadastro(){
		return datacadastro;
	}
}
