package estoque;

public class Produto 
{
	private int idProduto;
	private String produtoNome;
	private String telefoneImportadora;
	private String enderecoImportadora;
	private String precoVenda;
	private String precoCompra;
	private int quantidade;
	private String datacadastro;
	public Produto(int idProduto, String produtoNome, String telefoneImportadora, String enderecoImportadora, int quantidade,
				   String precoCompra, String precoVenda, String datacadastro) {
		super();
		setIdProduto(idProduto);
		setProdutoNome(produtoNome);
		setTelefoneImportadora(telefoneImportadora);
		setEnderecoImportadora(enderecoImportadora);
		setQuantidade(quantidade);
		setPrecoCompra(precoCompra);
		setPrecoVenda(precoVenda);
		setDatacadastro(datacadastro);
	}

    public Produto() {

    }

	public void setIdProduto(int idProduto){
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
	public int getIdProduto() {return idProduto;}
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

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
