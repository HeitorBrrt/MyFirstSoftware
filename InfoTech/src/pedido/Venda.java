package pedido;

public class Venda {
	private String idVenda;
	private Float precoTotal;
	private String dataVenda;
	private int idCliente;
	private String idUsuario;
	private Integer qtdItem;
	private String idProduto;

	public Venda(String idVenda, Float precoTotal, String dataVenda, int idCliente, String idUsuario,
			Integer qtdItem, String idProduto)  {
		super();
		setIdVenda(idVenda);
		setPrecoTotal(precoTotal);
		setDataVenda(dataVenda);
		setIdCliente(idCliente);
		setIdUsuario(idUsuario);
		setQtdItem(qtdItem);
		setIdProduto(idProduto);
	}

    public Venda() {

    }

	public void setIdVenda(String idVenda)  {
		this.idVenda = idVenda;

	}

	public void setPrecoTotal(Float precoTotal)  {
		this.precoTotal = precoTotal;
	}

	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;

	}

	public void setIdCliente(int idCliente){
		this.idCliente = idCliente;
  }

	public void setIdUsuario(String idUsuario) {
		this.idUsuario=idUsuario;
	}

	public void setQtdItem(Integer qtdItem) {
			this.qtdItem = qtdItem;

	}
	public void setIdProduto( String idProduto){
		this.idProduto=idProduto;
	}

	////////////////////////////////////////////////////////////////
	public String getIdVenda(){ return idVenda;}
	public Float getPrecoTotal(){ return precoTotal;}
	public String getDataVenda(){ return dataVenda;}
	public int getIdCliente(){ return idCliente;}
	public String getIdUsuario(){ return idUsuario;}
	public  Integer getQtdItem(){ return qtdItem;}
	public  String getIdProduto(){ return idProduto;}
///////////////////////////////////////////////////////////////////
	public String toString() {
		return "idVenda=" +this.getIdVenda() + ", precoTotal=" + getPrecoTotal() + ", dataVenda=" + this.getDataVenda() + ", idCliente="
				+ this.getIdCliente() + ", idUsuario=" + this.getIdUsuario() + ", qtdItem=" + this.getQtdItem() + ", idProduto=" + this.getIdProduto()
				+ ", serieItem=" ;
	}
}
