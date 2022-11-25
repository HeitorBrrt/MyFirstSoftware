package pedido;

public class Venda {
	private String idVenda;
	private String precoTotal;
	private String dataVenda;
	private int idCliente;
	private String idUsuario;
	private String qtdItem;
	private String idProduto;



	private String descricao;

	public Venda(String idVenda, String descricao, String precoTotal, String dataVenda, String idCliente, String idUsuario,
				 String qtdItem, String idProduto)  {
		super();
		setIdVenda(idVenda);
		setPrecoTotal(precoTotal);
		setDataVenda(dataVenda);
		setIdCliente(idCliente);
		setIdUsuario(idUsuario);
		setQtdItem(qtdItem);
		setIdProduto(idProduto);
		setDescricao(descricao);
	}

    public Venda() {

    }
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setIdVenda(String idVenda)  {
		this.idVenda = idVenda;

	}

	public void setPrecoTotal(String precoTotal)  {
		this.precoTotal = precoTotal;
	}

	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;

	}

	public void setIdCliente(String idCliente){
		this.idCliente = Integer.parseInt(idCliente);
  }

	public void setIdUsuario(String idUsuario) {
		this.idUsuario=idUsuario;
	}

	public void setQtdItem(String qtdItem) {
			this.qtdItem = qtdItem;

	}
	public void setIdProduto( String idProduto){
		this.idProduto=idProduto;
	}

	////////////////////////////////////////////////////////////////
	public String getIdVenda(){ return idVenda;}
	public String getPrecoTotal(){ return precoTotal;}
	public String getDataVenda(){ return dataVenda;}
	public int getIdCliente(){ return idCliente;}
	public String getIdUsuario(){ return idUsuario;}
	public String getQtdItem(){ return qtdItem;}
	public  String getIdProduto(){ return idProduto;}
///////////////////////////////////////////////////////////////////

}
